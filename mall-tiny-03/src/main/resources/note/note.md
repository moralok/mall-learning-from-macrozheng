**1. 设置具有过期时间的验证码的时候应该使用原子性操作 setNx**

**2. 验证正确时应该删除验证码，并保证过程的原子性**

**3. 客户端依赖并没有显式指定为 jedis，这没问题吗？**