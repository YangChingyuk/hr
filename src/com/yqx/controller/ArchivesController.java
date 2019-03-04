package com.yqx.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yqx.dao.ArchivesDao;
import com.yqx.daoImpl.ArchivesDaoImpl;
import com.yqx.entity.Archives;
import com.yqx.vo.ArchivesVO;

@Controller
public class ArchivesController {
	
	@RequestMapping("/aradd")
	public void add(HttpServletRequest request,HttpServletResponse response,Archives s,Map<String,Object> map) throws Exception {
		ArchivesDao dao = new ArchivesDaoImpl();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		JSONObject jo = new JSONObject();
		try {
			dao.add(s);
			jo.put("state", 0);
			jo.put("msg", "成功新增记录");
		} catch (Exception e) {
			jo.put("state", -1);
			jo.put("msg", "新增记录失败" + e.getMessage());
		} finally {
			String str = JSON.toJSONString(jo);
			out.write(str);
			out.flush();
			out.close();
		}
		
	}
	@RequestMapping("/ardeleteById")
	public void deleteById(int id) {
		ArchivesDao dao = new ArchivesDaoImpl();
		dao.deleteById(id);
	}
	@RequestMapping("/ardeleteMore")
	@ResponseBody
	public void deleteMore(HttpServletRequest request,HttpServletResponse response,String ids,Map<String,Object> map) throws Exception {
		ArchivesDao dao = new ArchivesDaoImpl();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		JSONObject jo = new JSONObject();
		try {
			dao.deleteMore(ids);
			jo.put("state", 0);
			jo.put("msg", "成功删除记录");
		} catch (Exception e) {
			jo.put("state", -1);
			jo.put("msg", "删除记录失败" + e.getMessage());
		} finally {
			String str = JSON.toJSONString(jo);
			out.write(str);
			out.flush();
			out.close();
		}
	}
	@RequestMapping("/arupdate")
	@ResponseBody
	public void update(HttpServletRequest request,HttpServletResponse response,Archives s,Map<String,Object> map) throws Exception {
		ArchivesDao dao = new ArchivesDaoImpl();
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		JSONObject jo = new JSONObject();
		try {
			dao.update(s);
			jo.put("state", 0);
			jo.put("msg", "成功修改记录");
		} catch (Exception e) {
			jo.put("state", -1);
			jo.put("msg", "修改记录失败" + e.getMessage());
		} finally {
			String str = JSON.toJSONString(jo);
			out.write(str);
			out.flush();
			out.close();
		}
		
	}
	@RequestMapping("/arqueryById")
	@ResponseBody
	public Archives queryById(HttpServletRequest request,HttpServletResponse response,int id,String currentPage,Map<String,Object> map) {
		String qname = request.getParameter("qname");
		String qusername = request.getParameter("qusername");
		String qsex = request.getParameter("qsex");
		
		ArchivesDao dao = new ArchivesDaoImpl();
		Archives s = dao.queryById(id);
		map.put("student", s);
		map.put("currentPage", currentPage);
		map.put("qname", qname);
		map.put("qusername", qusername);
		map.put("qsex", qsex);
		return s;
	}
	/*@RequestMapping("/arqueryByPage")
	@ResponseBody
	public void queryByPage(HttpServletRequest request,HttpServletResponse response,String page,Map<String,Object> map) throws Exception {
		String currentPage = request.getParameter("page");
		String rows = request.getParameter("rows");

		String condition = " where 1=1 ";
		
		ArchivesDao dao = new ArchivesDaoImpl();

		int sp = 1;

		int totals = dao.getTotals(condition);

		int pageSize = Integer.parseInt(rows);

		int pageCounts = totals / pageSize;
		if (totals % pageSize != 0) {
			pageCounts++;
		}
		try {
			sp = Integer.parseInt(currentPage);
		} catch (Exception e) {
			sp = 1;
		}
		if (sp > pageCounts) {
			sp = pageCounts;
		}
		if (sp < 1) {
			sp = 1;
		}
		List<Archives> list = dao.queryByPage(sp, pageSize, condition);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		JSONObject jo = new JSONObject();
		jo.put("total", totals);
		jo.put("rows", list);
		String json = JSON.toJSONString(jo);
		out.write(json);
		out.flush();
		out.close();
	}*/
	
	@RequestMapping("/arqueryByPage")
	@ResponseBody
	public void getByPage(HttpServletRequest request,HttpServletResponse response,String page,Map<String,Object> map) throws Exception {
		String currentPage = request.getParameter("page");
		String rows = request.getParameter("rows");

		String condition = " where 1=1 ";
		
		ArchivesDao dao = new ArchivesDaoImpl();

		int sp = 1;

		int totals = dao.getTotals();

		int pageSize = Integer.parseInt(rows);

		int pageCounts = totals / pageSize;
		if (totals % pageSize != 0) {
			pageCounts++;
		}
		try {
			sp = Integer.parseInt(currentPage);
		} catch (Exception e) {
			sp = 1;
		}
		if (sp > pageCounts) {
			sp = pageCounts;
		}
		if (sp < 1) {
			sp = 1;
		}
		List<ArchivesVO> list = dao.getByPage(sp, pageSize);
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		JSONObject jo = new JSONObject();
		jo.put("total", totals);
		jo.put("rows", list);
		String json = JSON.toJSONString(jo);
		out.write(json);
		out.flush();
		out.close();
	}
	
	
	/*
	 * 处理参数为日期格式
	 * */
	@InitBinder
	public void initBinder(ServletRequestDataBinder binder){
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),
	            true));
	}
}
