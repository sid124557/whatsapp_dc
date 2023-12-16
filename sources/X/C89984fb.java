package X;

import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.4fb  reason: invalid class name and case insensitive filesystem */
public final class C89984fb extends AnonymousClass5UI {
    public final AnonymousClass66R A00;

    public final long A06(AnonymousClass32L r5) {
        int hashCode = r5.A00.hashCode();
        if (this.A01 != null) {
            return ((long) 16321564) | (((long) hashCode) << 32);
        }
        UserFlowLogger userFlowLogger = this.A00;
        if (userFlowLogger != null) {
            return userFlowLogger.generateFlowId(16321564, hashCode);
        }
        throw C18290x4.A0Y();
    }

    public final boolean A07(AnonymousClass32L r3) {
        if (C18270x1.A1V(this.A00) || r3.A02) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89984fb(AnonymousClass1VX r3, AnonymousClass8JQ r4) {
        super((UserFlowLogger) r4.A05.getValue(), (C32251pv) null);
        C18260x0.A0Q(r3, r4);
        this.A00 = C154517dI.A00(AnonymousClass58H.PUBLICATION, new C118835w0(r3));
    }
}
