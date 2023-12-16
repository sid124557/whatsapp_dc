package X;

import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.0GI  reason: invalid class name */
public enum AnonymousClass0GI {
    DEFAULT(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID);
    
    public final String value;

    public String toString() {
        return this.value;
    }

    /* access modifiers changed from: public */
    AnonymousClass0GI(String str) {
        this.value = str;
    }

    public static AnonymousClass0GI A00(String str) {
        for (AnonymousClass0GI r1 : values()) {
            if (r1.toString().equals(str)) {
                return r1;
            }
        }
        return DEFAULT;
    }
}
