package com.flms.service;

import java.util.List;

import com.flms.pojo.JobsWorkers;
import com.flms.pojo.Page;

public interface JobsWorkerService {

	// ��ѯȫ����Ա��ְλģ��
	Page<JobsWorkers> findJobsWithWorkers(int currentPage);

	//��ѯȫ�������ʽ���ģ��
	List<JobsWorkers> findJobsWithWorkers2();

	// �����Ų�ѯ
	Page<JobsWorkers> findJobsWithWorkersByWno(int currentPage, String wno);

	// �����Ų�ѯ
	Page<JobsWorkers> findJobsWithWorkersByJdept(int currentPage, String jdept);
}
