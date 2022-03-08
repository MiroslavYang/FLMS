package com.flms.dao;

import com.flms.pojo.Wj;

import java.util.List;

/*
 *
 *@author:flms
 *@time:2022-3-2
 *
 */

public interface WJDao {
    //����
    void insertWJ(Wj wj);
    // ����
    void updateWJ(Wj wj);
    // ɾ��
    void deleteWjById(Integer id);

    // ȫ������
    List<Wj> selectWJAll();

    // ���ҹ���
    List<String> selectWnoOfWj();

    // ͨ�����Ų���
    Wj selectWJByWno(String wno);
}
