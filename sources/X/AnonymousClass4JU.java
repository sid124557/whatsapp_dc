package X;

import com.whatsapp.dependencybridge.di.DependencyBridgeModule;

/* renamed from: X.4JU  reason: invalid class name */
public class AnonymousClass4JU implements C183538qC {
    public Object A00;
    public final int A01;

    public AnonymousClass4JU(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object get() {
        C60152y5 r1;
        String str;
        switch (this.A01) {
            case 1:
                r1 = (C60152y5) this.A00;
                str = "server_prop_preferences";
                break;
            case 2:
                return new AnonymousClass3LO((DependencyBridgeModule) this.A00);
            case 3:
                r1 = (C60152y5) this.A00;
                str = "ab-props";
                break;
            default:
                r1 = (C60152y5) this.A00;
                str = C58152un.A0A;
                break;
        }
        return r1.A03(str);
    }
}
