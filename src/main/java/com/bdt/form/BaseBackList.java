package com.bdt.form;

import java.util.List;

//需要有返回值的情况

/**
 * 
 */
public class BaseBackList extends ErrorMesBase {
    private static final long serialVersionUID = 4087243160737818880L;
    private List<?> list;

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
        setSuccess();
    }
}
