package com.spring.demo.springbootexample.mybatis.po;

public class Hello {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hello.name
     *
     * @mbggenerated Fri May 04 11:16:01 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hello.name
     *
     * @return the value of hello.name
     *
     * @mbggenerated Fri May 04 11:16:01 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hello.name
     *
     * @param name the value for hello.name
     *
     * @mbggenerated Fri May 04 11:16:01 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}