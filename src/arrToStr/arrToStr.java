package arrToStr;

public class arrToStr {

	
	public static void main(String[] args)
	{
		String str = null;
		int i = 0;
	    String[] arr = {"", "", "test","", "test1", "test2","", "", ""};
	    		str = arrToStr(arr, "-", ";");
	    System.out.println(str);
	}
	
	

	public static String arrToStr2(String[] arr, String symbol, String symbol1)
	{
	    // 实例化StringBuffer
	    StringBuffer sb = new StringBuffer();
	    // 判断arr是否为有效数组
	    if (arr != null && arr.length > 0)
	    {
	        // 遍历数组
//	        for (String s : arr)
//	        {
	          for(int i=0;i<arr.length;i++) {
	        	if((i+1)%3!=0) { 	
	            // 将字符串追加到StringBuffer中
	            sb.append(arr[i]);
	            // 将字符串追加到StringBuffer中
	            sb.append(symbol);
	        	}
	        	else {
	        		sb.append(arr[i]);
	        	    sb.append(symbol1);
	        	}         
	          }
//	        }
	        // 判断字符串长度是否有效
	        if (sb.length() > 0)
	        {
	            // 截取字符
	            sb = sb.deleteCharAt(sb.length() - 1);
	        }
	    }
	    // 返回字符串
	    return sb.toString();
	}
	

/**
 * 将数组转换成为字符串
 * @param arr    字符串数组
 * @param symbol 连接符号
 * @return 字符串
 */
public static String arrToStr(String[] arr, String symbol, String symbol1)
{
    // 实例化StringBuffer
    StringBuffer sb = new StringBuffer();
    // 判断arr是否为有效数组
    if (arr != null && arr.length > 0)
    {
        // 遍历数组
//        for (String s : arr)
//        {
          for(int i=0;i<arr.length;i++) {
        	if((i+1)%3!=0) { 	
            // 将字符串追加到StringBuffer中
            sb.append(arr[i]);
            // 将字符串追加到StringBuffer中
            sb.append(symbol);
        	}
        	else {
        		sb.append(arr[i]);
        	    sb.append(symbol1);
        	}         
          }
//        }
        // 判断字符串长度是否有效
        if (sb.length() > 0)
        {
            // 截取字符
            sb = sb.deleteCharAt(sb.length() - 1);
        }
    }
    // 返回字符串
    return sb.toString();
}
	
}
