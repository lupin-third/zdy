package com.springboot.zdy.codegenerator;


import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.BeetlTemplateEngine;

import java.util.*;

/**
 * @author dengyuan zhang
 * @date 2021/2/25 - 14:16
 */
public class MyBatisAutoCreateCode {
    public static void main(String[] args) {
        System.out.println("是否开始自动生成(y)");
        if (new Scanner(System.in).next().equalsIgnoreCase("y") == false) {
            return;
        }
        //自动代码生成器
        AutoGenerator mpg = new AutoGenerator();
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        //生成后代码存放的位置System.getProperty("user.dir")获取当前项目路径E:\IdeaLocalProject\springBootProject\springboot\zdy
        final String projectPath = System.getProperty("user.dir");
        String ControllerDir = projectPath + "/zdy-web/src/main/java/com/springboot/zdy/controller";
        String EntityDir = projectPath + "/zdy-entity/src/main/java/com/springboot/zdy/entity";
        String ServiceDir = projectPath + "/zdy-service/src/main/java/com/springboot/zdy/service";
        String ServiceImplDir = projectPath + "/zdy-service/src/main/java/com/springboot/zdy/service/impl";
        String DaoDir = projectPath +"/zdy-dao/src/main/java/com/springboot/zdy/dao";
        String MapperDir = projectPath + "/zdy-web/src/main/resources/mappers";

//        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("zhang dengyuan");
        gc.setOpen(false);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        gc.setControllerName("%sController");
        gc.setMapperName("%sDao");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        mpg.setGlobalConfig(gc);

        //sqlserver数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:sqlserver://127.0.0.1:1433;DatabaseName=zdy");
        dsc.setDriverName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dsc.setUsername("sa");
        dsc.setPassword("net2k");
        mpg.setDataSource(dsc);

        //包配置
        final PackageConfig pc = new PackageConfig();
        //设置项目模块
        pc.setModuleName("");
        //模块包名
        pc.setParent("com.springboot.zdy");
        //设置并生成存放实体类包
        pc.setEntity("entity");
        //设置并生成存放dao接口的包
        pc.setMapper("dao");
        mpg.setPackageInfo(pc);
        Map<String, String> pathInfo = new HashMap<>();
        pathInfo.put(ConstVal.ENTITY_PATH,EntityDir);
        pathInfo.put(ConstVal.MAPPER_PATH,DaoDir);
        pathInfo.put(ConstVal.XML_PATH,MapperDir);
        pathInfo.put(ConstVal.SERVICE_PATH,ServiceDir);
        pathInfo.put(ConstVal.SERVICE_IMPL_PATH,ServiceImplDir);
        pathInfo.put(ConstVal.CONTROLLER_PATH,ControllerDir);
        pc.setPathInfo(pathInfo);


        //输出xml文件
        String templatePath = "/templates/mapper.xml.btl";
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {

            }
        };

        //自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        //自定义配置会优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                //自定义文件输出名，如果Entity设置了前后缀，此处xml的名称会跟着变化
                return MapperDir+"/"+tableInfo.getEntityName()+"Mapper.xml";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        //配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);

        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        //strategy.setInclude(可选择要生成的表名，多个英文逗号分隔);
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //strategy.setEntityLombokModel(true);//自动生成Lombok
        //开启 RestFul 风格
        strategy.setRestControllerStyle(false);
        strategy.setControllerMappingHyphenStyle(true);
        //设置逻辑删除，对表中的那个字段
        strategy.setLogicDeleteFieldName("deleted");


        //自动填充
        TableFill createTime = new TableFill("create_time", FieldFill.INSERT);
        TableFill updateTime = new TableFill("update_time", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(createTime);
        tableFills.add(updateTime);
        strategy.setTableFillList(tableFills);

        //乐观锁配置
        strategy.setVersionFieldName("version");

        mpg.setStrategy(strategy);
        mpg.setTemplateEngine(new BeetlTemplateEngine());
        mpg.execute();
        System.out.println("完成");




    }
}
