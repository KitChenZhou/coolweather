package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport { //  LitePal中的每个实体需要继承DataSupport类

    private int id;

    private String provinceName;

    private int provinceCode;// 省的代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
