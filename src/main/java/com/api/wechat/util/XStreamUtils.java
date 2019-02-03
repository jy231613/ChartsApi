package com.api.wechat.util;

//import com.thoughtworks.xstream.XStream;
//import com.thoughtworks.xstream.security.AnyTypePermission;
//import top.lmyang.wechat.subscription.entity.base.BaseMsgXmlBean;

/**
 * 描述信息：XStream 工具类
 *
 * @author LMyang
 * @version 1.0
 * @date 2018/12/27 15:38
 */
public class XStreamUtils {

//    public static <T extends BaseMsgXmlBean> String beanToXml(T msgResponseXmlBean) {
//        XStream xStream = new XStream();
//        xStream.addPermission(AnyTypePermission.ANY);
//        XStream.setupDefaultSecurity(xStream);
//        xStream.allowTypes(new Class[]{msgResponseXmlBean.getClass()});
//        xStream.alias("xml", msgResponseXmlBean.getClass());
//        return xStream.toXML(msgResponseXmlBean);
//    }
//
//    @SuppressWarnings("unchecked")
//    public static <T extends BaseMsgXmlBean> T xmlToBean(Class<T> klass, String xmlDate) {
//        XStream xStream = new XStream();
//        XStream.setupDefaultSecurity(xStream);
//        xStream.addPermission(AnyTypePermission.ANY);
//        xStream.allowTypes(new Class[]{klass});
//        xStream.alias("xml", klass);
//        return (T) xStream.fromXML(xmlDate);
//    }

}
