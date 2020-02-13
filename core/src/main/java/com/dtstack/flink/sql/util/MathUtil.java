/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */



package com.dtstack.flink.sql.util;

import java.math.BigDecimal;

/**
 * Date: 2017/4/21
 * Company: www.dtstack.com
 * @author xuchao
 */

public class MathUtil {

    public static Long getLongVal(Object obj){
        if(obj == null){
            return null;
        }

        if(obj instanceof String){
            return Long.valueOf((String) obj);
        }else if(obj instanceof Long){
            return (Long) obj;
        }else if(obj instanceof Integer){
            return Long.valueOf(obj.toString());
        }

        throw new RuntimeException("not support type of " + obj.getClass() + " convert to Long." );
    }

    public static Integer getIntegerVal(Object obj){
        if(obj == null){
            return null;
        }

        if(obj instanceof String){
            return Integer.valueOf((String) obj);
        } else if (obj instanceof Integer){
            return (Integer) obj;
        } else if (obj instanceof Long){
            return ((Long)obj).intValue();
        } else if(obj instanceof Double){
            return ((Double)obj).intValue();
        } else if(obj instanceof BigDecimal){
            return ((BigDecimal)obj).intValue();
        }

        throw new RuntimeException("not support type of " + obj.getClass() + " convert to Integer." );
    }

    public static Float getFloatVal(Object obj) {
        if (obj == null) {
            return null;
        }

        if (obj instanceof String) {
            return Float.valueOf((String) obj);
        } else if (obj instanceof Float) {
            return (Float) obj;
        } else if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).floatValue();
        }

        throw new RuntimeException("not support type of " + obj.getClass() + " convert to Float.");
    }

    public static Float getFloatVal(Object obj, float defaultVal) {
        if (obj == null) {
            return defaultVal;
        }

        return getFloatVal(obj);
    }

    public static Double getDoubleVal(Object obj) {
        if (obj == null) {
            return null;
        }

        if (obj instanceof String) {
            return Double.valueOf((String) obj);
        } else if (obj instanceof Float) {
            return ((Float) obj).doubleValue();
        } else if (obj instanceof Double){
            return (Double) obj;
        }else if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).doubleValue();
        }else if (obj instanceof Integer){
            return ((Integer)obj).doubleValue();
        }

        throw new RuntimeException("not support type of " + obj.getClass() + " convert to Double.");
    }

    public static Double getDoubleVal(Object obj, double defaultVal) {
        if (obj == null) {
            return defaultVal;
        }

        return getDoubleVal(obj);
    }

    public static Boolean getBoolean(Object obj, boolean defaultVal){
        if(obj == null){
            return defaultVal;
        }

        return getBoolean(obj);
    }

    public static Boolean getBoolean(Object obj){
        if(obj == null){
            return null;
        }

        if(obj instanceof String){
            return Boolean.valueOf((String) obj);
        }else if(obj instanceof Boolean){
            return (Boolean) obj;
        }

        throw new RuntimeException("not support type of " + obj.getClass() + " convert to Boolean." );
    }

    public static String getString(Object obj){
        if(obj == null){
            return null;
        }

        if(obj instanceof String){
            return (String) obj;
        }else {
            return obj.toString();
        }
    }

    public static Byte getByte(Object obj) {
        if (obj == null) {
            return null;
        }

        if (obj instanceof String) {
            return Byte.valueOf((String) obj);
        } else if (obj instanceof Byte) {
            return (Byte) obj;
        }

        throw new RuntimeException("not support type of " + obj.getClass() + " convert to Byte.");
    }

    public static Short getShort(Object obj) {
        if (obj == null) {
            return null;
        }

        if (obj instanceof String) {
            return Short.valueOf((String) obj);
        } else if (obj instanceof Short) {
            return (Short) obj;
        }

        throw new RuntimeException("not support type of " + obj.getClass() + " convert to Short.");
    }
}
