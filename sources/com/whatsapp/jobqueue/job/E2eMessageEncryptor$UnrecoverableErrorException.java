package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass001;
import com.whatsapp.jid.DeviceJid;

public class E2eMessageEncryptor$UnrecoverableErrorException extends Exception {
    public E2eMessageEncryptor$UnrecoverableErrorException(DeviceJid deviceJid) {
        super(AnonymousClass000.A0P(deviceJid, "Unable to encrypt message for ", AnonymousClass001.A0o()));
    }
}
