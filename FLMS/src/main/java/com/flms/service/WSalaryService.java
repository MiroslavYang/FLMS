package com.flms.service;

import java.util.List;

import com.flms.pojo.Page;
import com.flms.pojo.WSalary;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public interface WSalaryService {

	// ��ѯȫ��
	Page<WSalary> findAllWSalaryByPage(int currentPage);

	List<WSalary> findAllWSalary();

	// �·ݲ�ѯ
	Page<WSalary> findWSalaryBySettleDateByPage(int currentPage, String settledate);

	Page<WSalary> findMySalaryBySettleDateByPage(int currentPage, String settledate,String wno);


	List<WSalary> findWSalaryBySettleDate(String settledate);

	// �����Ų�ѯ
	Page<WSalary> findWSalaryByWno(int currentPage, String wno);

	List<WSalary> findselectMySalary(String wno);


	// �����Ų�ѯ
	Page<WSalary> findWSalaryByJDept(int currentPage, String jdept);


	// ���
	void addWSalary(WSalary wsalary);

	//�������
	void addWSalaryBatch(List<WSalary> wSalaryList);

	// ɾ��
	void deleteWSalary(int[] wsidArray);

	// ��ӡ
	HSSFWorkbook toExcel(List<WSalary> list);

	// ���Ź���
	void grantWSalary(int[] wsidArray);

	void grantWSalaryAll();

	//��ձ�
	void truncateWsalary();
}
