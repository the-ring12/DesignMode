package com.ring.faced;

/**
 * 加密外观类
 *
 * @author: the_ring
 * @time: 2022/1/4 15:27
 */
public class EncryptFacade {
    /**
     * 维持对子系统对象的引用
     */
    private final FileReader reader;
    private final CipherMachine cipherMachine;
    private final FileWriter writer;


    public EncryptFacade() {
        reader = new FileReader();
        cipherMachine = new CipherMachine();
        writer = new FileWriter();
    }

    /**
     * 调用子系统对象的业务方法
     *
     * @param fileNameSrc
     * @param fileNameDes
     */
    public void fileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.read(fileNameSrc);
        String encryptStr = cipherMachine.encrypt(plainStr);
        writer.write(encryptStr, fileNameDes);
    }
}
