package com.zhengqing.aigou;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.*;

public class GenteratorCode {

    public static void main(String[] args) throws InterruptedException {

        String []  tables = new String[]{"USER"};


        //用来获取Mybatis-Plus.properties文件的配置信息
        final ResourceBundle rb = ResourceBundle.getBundle("gen-company");
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(rb.getString("OutputDir"));
        gc.setFileOverride(true);//覆盖相同文件
        gc.setActiveRecord(true);// 开启 activeRecord 模式
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columList
        gc.setAuthor(rb.getString("author"));
        gc.setSwagger2(true);//model 生成字段说明注解
        gc.setMapperName("%sDao");//文件名设置
        mpg.setGlobalConfig(gc);
        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.ORACLE);
        dsc.setTypeConvert(new MySqlTypeConvert());
        dsc.setDriverName(rb.getString("jdbc.driver"));
        dsc.setUsername(rb.getString("jdbc.user"));
        dsc.setPassword(rb.getString("jdbc.pwd"));
        dsc.setUrl(rb.getString("jdbc.url"));
        mpg.setDataSource(dsc);
        // ********策略配置******
        StrategyConfig strategy = new StrategyConfig();
        //strategy.setTablePrefix(new String[] { "ORDER_" });// 表前缀忽略
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略  驼峰
        strategy.setInclude(tables); //需要生成的表
        strategy.setEntityLombokModel(true); //使用lombok插件 不生成getter seter
        mpg.setStrategy(strategy);
        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(rb.getString("parent"));
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setEntity("model");
        pc.setMapper("dao");
        mpg.setPackageInfo(pc);

        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-rb");
                this.setMap(map);
            }
        };

        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();

        // 调整 domain 生成目录演示
        /*focList.add(new FileOutConfig("/templates/entity.java.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return rb.getString("OutputDirBase")+ "/com/zhengqing/aigou/model/" + tableInfo.getEntityName() + ".java";
            }
        });*/
        // 调整 xml 生成目录演示
        focList.add(new FileOutConfig("/templates/mapperdemo.xml.vm") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return rb.getString("OutputDirXml")+ "/mapper/" + tableInfo.getEntityName() + "Mapper.xml";
            }
        });

        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        /*
         *  自定义模板配置
         *  根据自己项目的开发风格，定义自己的模板 放在、resource/templates  下
         *  优先加载  项目resource/templates 下的模板，然后加载  maven   mybatis-plus generator  包下内置模板
         */
        TemplateConfig tc = new TemplateConfig();
        tc.setService("/templates/servicedemo.java.vm");
        tc.setServiceImpl("/templates/serviceimpldemo.java.vm");
        tc.setEntity("/templates/entity.java.vm");
        tc.setMapper("/templates/daodemo.java.vm"); // "/templates/mapper.java.vm"
        tc.setController("/templates/controllerdemo.java.vm");
        tc.setXml(null);
        // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
        mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();
    }

}