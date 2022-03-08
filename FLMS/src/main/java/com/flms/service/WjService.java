package com.flms.service;

import com.flms.pojo.Wj;

import java.util.List;

/*
 *
 *@author:flms
 *@time:2022-3-1
 *
 */
public interface WjService {

    // ���
    void addWj(Wj wj);

    // ɾ��
    void deleteWj(Integer[] id);

    // �޸�
    void updateWj(Wj wj);



    //���ҹ���
    List<String> findWnoOfWj();

    // ͨ�����Ų���
    Wj findWJByWno(String wno);
}
