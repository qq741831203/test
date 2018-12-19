package test;


/**
 * Created by felix on 9/15/15.
 * 定义系统数据的删除状态和激活状态
 */
public enum DataStatus {

    /**
     * 关闭
     */
    ACTIVE("active"),

    /**
     * 激活
     */
    DELETE("delete");


    /**
     * 返回结果枚举构造方法
     *
     * @param code        结果码
     */
    DataStatus( String code) {
    	this.code = code;
    }

    /**
     * 店铺状态code
     */
    private String code;


    /**
     * 获得店铺状态代码
     *
     * @return 店铺状态代码
     */
    public String getCode() {
        return code;
    }


    /**
     * 通过code得到返回结果对象
     *
     * @param code 结果码
     * @return 结果枚举对象
     */
    public static DataStatus get(String code) {
        if ("".equals(code) || code == null) {
            throw new RuntimeException("状态码不存在！");
        }
        DataStatus[] list = values();
        for (DataStatus dataStatus : list) {
            if (code.equals(dataStatus.getCode().toString())) {
                return dataStatus;
            }
        }
        return null;
    }
    public static void put() {
    	 DataStatus[] list = values();
    	 for (DataStatus dataStatus : list) {
			System.out.println(dataStatus);
		}
	}

    @Override
    public String toString() {
        return "DataStatus{" +
                "code=" + code +
                '}';
    }
}
