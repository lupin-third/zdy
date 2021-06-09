package com.springboot.zdy.webservice;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import javax.xml.namespace.QName;

/**
 * @author dengyuan zhang
 * @date 2021/5/29 - 19:10
 */
public class CxfWebServiceDemo {
    public static void main(String[] args) {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        //以下地址为网络公用邮箱验证地址
        Client client = dcf.createClient("http://www.webxml.com.cn/webservices/qqOnlineWebService.asmx?wsdl");
        //自动获取命名空间
        String namespaceURI = client.getEndpoint().getService().getName().getNamespaceURI();
        QName name = new QName(namespaceURI, "qqCheckOnline");//传入命名空间，传入方法名
        String xmlStr = "826744017";
        Object[] objects;
        try {
            objects = client.invoke(name, xmlStr);
            System.out.println(objects[0].toString());
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
