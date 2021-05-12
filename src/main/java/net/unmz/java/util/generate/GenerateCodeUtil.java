package net.unmz.java.util.generate;

import net.unmz.java.util.generate.defined.FtlDef;
import net.unmz.java.util.generate.factory.CodeGenerateFactory;

import java.util.List;

/**
 * Project Name: 代码生成工具类
 * 功能描述：输入表名和作者,生成对应的表所对应的所有基础结构
 *
 * @author Faritor
 * @version 1.2
 * @date 2017-11-08 19:36
 * @since JDK 1.8
 */
public class GenerateCodeUtil {

    public static void generateCode(String tableName, String author) {
        generateCode(tableName, null, author);
    }

    public static void generateCode(String tableName, String codeName, String author) {
        String keyType = FtlDef.KEY_TYPE_01;//主键生成方式 01:UUID  02:自增
        CodeGenerateFactory.codeGenerate(tableName, codeName, keyType, author);
    }

    public static void generateCodeList(List<String> tableList, String author) {
        generateCodeList(tableList, null, author);
    }

    public static void generateCodeList(List<String> tableList, String codeName, String author) {
        String keyType = FtlDef.KEY_TYPE_01;//主键生成方式 01:UUID  02:自增
        CodeGenerateFactory.codeGenerateList(tableList, codeName, keyType, author);
    }

}
