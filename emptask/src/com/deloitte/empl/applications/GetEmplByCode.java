package com.deloitte.empl.applications;

import com.deloitte.empl.beans.Emp;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class GetEmplByCode {
	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();
		Emp e = dao.getEmpByCode(7);
		System.out.println(e.getEmpno()+" "+e.getEname()+" "+e.getJob()+" "+
				e.getMgr()+" "+e.getHiredate()+" "+e.getSal()+" "+e.getComm()+" "+
				e.getDeptno());
	}

}
