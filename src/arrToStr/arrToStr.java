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
	    // ʵ����StringBuffer
	    StringBuffer sb = new StringBuffer();
	    // �ж�arr�Ƿ�Ϊ��Ч����
	    if (arr != null && arr.length > 0)
	    {
	        // ��������
//	        for (String s : arr)
//	        {
	          for(int i=0;i<arr.length;i++) {
	        	if((i+1)%3!=0) { 	
	            // ���ַ���׷�ӵ�StringBuffer��
	            sb.append(arr[i]);
	            // ���ַ���׷�ӵ�StringBuffer��
	            sb.append(symbol);
	        	}
	        	else {
	        		sb.append(arr[i]);
	        	    sb.append(symbol1);
	        	}         
	          }
//	        }
	        // �ж��ַ��������Ƿ���Ч
	        if (sb.length() > 0)
	        {
	            // ��ȡ�ַ�
	            sb = sb.deleteCharAt(sb.length() - 1);
	        }
	    }
	    // �����ַ���
	    return sb.toString();
	}
	

/**
 * ������ת����Ϊ�ַ���
 * @param arr    �ַ�������
 * @param symbol ���ӷ���
 * @return �ַ���
 */
public static String arrToStr(String[] arr, String symbol, String symbol1)
{
    // ʵ����StringBuffer
    StringBuffer sb = new StringBuffer();
    // �ж�arr�Ƿ�Ϊ��Ч����
    if (arr != null && arr.length > 0)
    {
        // ��������
//        for (String s : arr)
//        {
          for(int i=0;i<arr.length;i++) {
        	if((i+1)%3!=0) { 	
            // ���ַ���׷�ӵ�StringBuffer��
            sb.append(arr[i]);
            // ���ַ���׷�ӵ�StringBuffer��
            sb.append(symbol);
        	}
        	else {
        		sb.append(arr[i]);
        	    sb.append(symbol1);
        	}         
          }
//        }
        // �ж��ַ��������Ƿ���Ч
        if (sb.length() > 0)
        {
            // ��ȡ�ַ�
            sb = sb.deleteCharAt(sb.length() - 1);
        }
    }
    // �����ַ���
    return sb.toString();
}
	
}
