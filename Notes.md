# Java后端学习总控

## 我的背景
- 软工24级，2027届，目标Java后端开发
- 每天可投入3小时（周末可加量至5-6小时）
- 当前基础：懂基本语法、哈希表/二叉树/链表/数组原理；无项目、无实习

## 总目标
- 2026.12前：Java核心 + LeetCode 100题 + 第一个Spring Boot项目，开始投日常实习
- 2027.3-5：全力投暑期实习

## 当前阶段
- 第1阶段：Java基础与算法入门，第1周第2天

## 已完成
### 第1天（2026-09-18）
- ✅ 安装并配置JDK、IDEA、Git，跑通Hello World
- ✅ 掌握Git流程（add → commit → push），成功推送代码到GitHub
- ✅ 完成两数之和的暴力解法（双重for循环）
- ✅ 掌握Scanner输入和奇偶数判断

### 第2天（2026-09-19）
- ✅ 理解哈希表原理，并在IDEA和LeetCode中完成两数之和的HashMap解法（O(n)）
- ✅ 深化理解：哈希表是“边遍历边存”，可以天然避免“自己配自己”的边界情况
- ✅ 掌握Java动态输入数组的方法（`sc.nextLine().split(" ")` 与 `Integer.parseInt()`）
- ✅ 手写九九乘法表（掌握`\t`对齐，理解`j<=i`下三角逻辑）
- ✅ 手写猜数字游戏（掌握`Random`、`while(true)`、`if-else`与`break`）
- ✅ 学会将代码封装成独立方法（`printMultiplicationTable()`、`guessNumberGame()`）
- ✅ 掌握面向对象基础：独立写出`Student`实体类（属性、无参/全参构造、getter/setter、`@Override` toString）
- ✅ 完成控制台版“学生管理系统v1.0”：`StudentManager`主类，用`ArrayList`和`switch`实现了添加、查询、删除、退出功能
- ✅ 解决了IDEA自动补全干扰问题，并成功提交本地代码到Git

## 本周目标（第1周）
- [x] LeetCode 两数之和（暴力 + HashMap）
- [ ] LeetCode 移动零、合并两个有序链表、有效的括号、环形链表
- [ ] 手写ArrayList简易实现
- [ ] 手写HashMap使用示例（统计字符）
- [ ] 异常处理与IO流练习（文件单词统计）
- [x] 完成第一个项目构思（控制台学生管理系统v1.0）
- [x] 每天git commit，保持GitHub活跃

## 卡点与解决
- 卡点1：理解HashMap解法时，疑惑为什么不一次性全部放入再查找 → 解决：一次性放入会引发“自己配自己”的问题（如target=4, nums[i]=2），边遍历边存天然规避了边界条件。
- 卡点2：写代码时变量拼写错误（`guss`）、`print`与`println`混用导致格式乱 → 解决：意识到“代码能跑”只是及格线，规范的命名和排版是专业程序员的标志。
- 卡点3：IDEA自动补全干扰 → 解决：通过设置（Editor → General → Code Completion）取消“Show suggestions as you type”。
- 卡点4：`git push`报错 `Failed to connect to github.com port 443` → 解决：网络波动，代码已在本地安全commit，需配置代理取消全局代理，或切换手机热点重试。
- 卡点5：初学面向对象，对`@Override`、`toString`、`switch`和`while(true)`的菜单循环骨架感到陌生 → 解决：通过比喻（开公司、花名册、对讲机）理解，并上手写出完整系统。

## 下一步最小行动
- 明天（周日）选做：
    1. 给学生管理系统加上“修改学生”功能，完成增删改查闭环。
    2. LeetCode“移动零”（双指针解法）。
- 网络恢复后，执行`git push`推送今天的代码和笔记。
- 每天结束前更新本文件并git commit。

## 请AI做的事
- 按每天3小时为我规划下一周任务，不要重复已完成内容
- 在我写代码卡住或遇到报错时，提供具体的排查步骤和原理讲解
- 网络恢复后，提醒我执行 `git push`