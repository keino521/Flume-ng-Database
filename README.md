# Flume-SqlSource
Flume-SqlSource

Flume  是一个强大的日志采集工具  
在大数据 领域使用 非常广泛 本身的架构又非常简单，而且灵活 。
但是本身不支持 一些 数据的源 。这里 做一些 拓展。欢迎提出不足和建议 

## 常见思路 
本身自带 各种工具 入 canal  ogg  等等
使用数据库的触发器  
使用数据库操作日志  如 binlog  
使用 sql  jdbc 查询 后 修改 目标表
同步 原理
1时间戳的增量
2主键或者某一字段的增量
3字段修改后的标记同步


## 支持数据源 

| 数据源  | source | sink |版本 |
| ------ | ------ | ------ | ------ |
| mysql |  |  |  |
| mongo |  |  |  |


## 使用方式 
高级Api 
低级Api 





## 配置文件样例

## 常见问题 