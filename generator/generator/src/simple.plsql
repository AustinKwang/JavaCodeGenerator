create or replace package body atest_student_p as
  
  /*==============================================================*/
   -- 功能说明:1.测试框架使用存储过程-根据sid删除该条记录
   -- 参数说明：
   -- 输入：
   --p_sid in number,学生编号号
   -- 输出：
   --删除是否成功的标志
   --创建者及创建日期：huangguowen 2010.11.15
   --维护者：
   --修改历史：修改日期，修改者，修改原因（简要说明）
   /*==============================================================*/
procedure del_atest_student(p_sid in number,p_code out varchar2) is
begin
  p_code :=1;
  delete from atest_student where sid = p_sid;
end del_atest_student;


                                           
end atest_student_p;
