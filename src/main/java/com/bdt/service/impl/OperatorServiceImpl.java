package com.bdt.service.impl;import java.util.List;import java.util.Map;import javax.annotation.Resource;import org.springframework.stereotype.Service;import com.bdt.dao.DAOBase;import com.bdt.dao.OperatorDAO;import com.bdt.entity.Operator;import com.bdt.service.OperatorService;@Servicepublic class OperatorServiceImpl extends ServiceImplBase<Operator, Long>        implements OperatorService {            @Resource    private OperatorDAO operatorDAO;        @Override    protected DAOBase<Operator, Long> getDAO() {        return operatorDAO;    }    @Override    public int operatorLogin(int operator_no, int password){        return operatorDAO.operatorLogin(operator_no, password);    }}