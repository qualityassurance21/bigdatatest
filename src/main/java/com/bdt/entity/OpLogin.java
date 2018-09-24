package com.bdt.entity;

import java.io.Serializable;

public class OpLogin {

    public class Operator implements Serializable {

        /**
         * serialVersionUID
         */
        private static final long serialVersionUID = 1L;


        protected String operator_no;
        protected String password;
        protected String authCode;

        public String getOperator_no() {
            return operator_no;
        }

        public void setOperator_no(String operator_no) {
            this.operator_no = operator_no;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAuthCode() {
            return authCode;
        }

        public void setAuthCode(String authCode) {
            this.authCode = authCode;
        }

        @Override
        public String toString() {
            return "Operator{" +
                    "operator_no='" + operator_no + '\'' +
                    ", password='" + password + '\'' +
                    ", authCode='" + authCode + '\'' +
                    '}';
        }
    }
}