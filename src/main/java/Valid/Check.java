package Valid;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.AreasDAO;
import dao.CellDao;
import dao.PrisonersDao;
import database.ConnectToDB;
import database.DML;
import entity.Account;


public class Check {
	
	static Boolean checkEx=false;
	static Boolean checkC;
	private static int check1;
	public static Boolean checkNull(String a) {
		if(a.isEmpty()) {
			return true;
		}
		return false;
	}
	public static Boolean checkNumber1(String a) {
		boolean isNumber = a.matches("^[0-9]+$");
		return isNumber;
	}
	public static Boolean checkString(String a) {
    	boolean String = true;
    	for (int i = 0; i < a.length(); i++) {
    	    if (Character.isDigit(a.charAt(i))) {
    	        String = false;
    	        break;
    	    }
    	}
    	//true là chuỗi toàn chữ, false là kí tự số
    	 return String;
    }
	public static int checkExistUser(String a) throws SQLException {
		check1=0;
		DML.selectTableAccount().forEach(ac->{
			if(ac.getUsername().equals(a)) {
				check1=1;
			}
		});
		return check1;		
	}
	public static int checkExistPass(String a) throws SQLException {
		check1=0;
		DML.selectTableAccount().forEach(ac->{
			if(ac.getPassword().equals(a)) {
				check1=1;
			}
		});
		return check1;		
	}
	public static int checkExistWardenIdAccount(int a) throws SQLException {
		check1=0;
		DML.selectTableAccount().forEach(ac->{
			if(ac.getWarden_id()==a) {
				check1=1;
			}
		});
		return check1;		
	}
	public static int checkExistPassAdmin(String a) throws SQLException {
		check1=0;
		DML.selectTableAdmin().forEach(ac->{
			if(ac.getPassword().equals(a)) {
				check1=1;
			}
		});
		return check1;	
	}
	public static int checkExistUserAdmin(String a) throws SQLException {
		check1=0;
		DML.selectTableAdmin().forEach(ac->{
			if(ac.getUsername().equals(a)) {
				check1=1;
			}
		});
		return check1;	
	}
	public static int checkLogin(String a,String b) throws SQLException {
		if(checkExistUserAdmin(a)==1 && checkExistPassAdmin(b)==1) {
			return 0;
		}else if(checkExistUser(a)==1 && checkExistPass(b)==1) {
			return 1;
		}
		return 2;
	}
	public static Boolean checkExistP(int id) throws SQLException {
		PrisonersDao.selectTablePrisoners().forEach(p->{
			if(p.getId()==id) {
				checkEx=true;
				return;
			}
		});
		return checkEx;
	}
	public static Boolean checkExistC(int ar,int cellN) throws SQLException {
		checkC=false;
		CellDao.selectTableCell().forEach(p->{
			if(p.getAreaId()==ar) {
				if(p.getCellNumber()==cellN) {
					checkC=true;
					return;
				}
			}
		});
		return checkC;
	}
	
}
