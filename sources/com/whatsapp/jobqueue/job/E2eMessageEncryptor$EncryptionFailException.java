package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import com.whatsapp.jid.DeviceJid;

public class E2eMessageEncryptor$EncryptionFailException extends Exception {
    public final int encryptionRetryCount;
    public final DeviceJid jid;

    public E2eMessageEncryptor$EncryptionFailException(DeviceJid deviceJid, int i) {
        super(AnonymousClass000.A0P(deviceJid, "Unable to encrypt message for ", AnonymousClass001.A0o()));
        this.jid = deviceJid;
        this.encryptionRetryCount = i;
    }
}
