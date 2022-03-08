package com.flms.service;

import java.util.List;

import com.flms.pojo.Jobs;
import com.flms.pojo.Page;

public interface JobService {
	// ��ѯȫ��ְλ��Ϣ
	List<Jobs> findAllJobs();

	Page<Jobs> findJobsByPage(int currentPage);


	List<Jobs> findJobsByJno(String jno);

	// ְλ���ؼ��ֲ�ѯ
	Page<Jobs> findJobsByJname(int currentPage, String jname);

	// �����Ų�ѯ
	Page<Jobs> findJobsByJdept(int currentPage, String jdept);

	// ���
	void addJobs(Jobs Jobs);

	// ɾ��
	void deleteJobs(String[] jnoArray);

	// �޸�
	void updateJobs(Jobs Jobs);
}
