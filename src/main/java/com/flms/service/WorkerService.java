package com.flms.service;

import java.util.List;

import com.flms.pojo.Page;
import com.flms.pojo.Workers;

public interface WorkerService {

	// ��ѯȫ��
	List<Workers> findAllWorkers();

	//��ҳ��ѯ
	Page<Workers> findWorkersByPage(int currentPage);

	Page<Workers> findWorkersByWnameByPage(int currentPage, String wname);

	//��ѯ�ܼ�¼
	int findCount();

	// �ؼ��ֲ�ѯ
	List<Workers> findWorkersByWname(String wname);

	// �����Ų�ѯ
	Page<Workers> findWorkersByWnoByPage(int currentPage, String wno);

	List<Workers> findWorkersByWno(String wno);

	// ���
	void addWorkers(Workers Workers);

	// ɾ��
	void deleteWorkers(String[] wnoArray);

	// �޸�
	void updateWorkers(Workers Workers);
}
