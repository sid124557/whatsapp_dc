package com.facebook.debug.tracer;

import X.C161617q6;
import X.C162457s7;
import X.C162477s9;
import X.C173808Rt;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;

public final class Tracer {
    public static final ThreadLocal A00 = new C173808Rt();

    public static final void A01(String str) {
        if ((32 & C161617q6.A02) != 0) {
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str);
            } catch (IllegalFormatException e) {
                C162477s9.A0B("Tracer", "Bad format string", e);
            }
            C162457s7.A0H(str);
            Systrace.A01(str);
        }
    }

    public static final void A00() {
        Systrace.A00();
    }
}
