package X;

import java.util.Map;

/* renamed from: X.9aa  reason: invalid class name and case insensitive filesystem */
public abstract class C196279aa implements C203459nj {
    public C1230166s A00;

    public void Ax1(Object obj, Map map, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BaseWaBkUserFlowCallbackDelegate/annotateUserFlow: marker=");
        A0o.append(C379224o.A00(i));
        C18260x0.A1P(A0o, ", annotationMap=", map);
    }

    public void B2T(Object obj, String str, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BaseWaBkUserFlowCallbackDelegate/endCancelUserFlow: marker=");
        C18260x0.A1J(A0o, C379224o.A00(i));
    }

    public void B2U(Object obj, String str, String str2, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BaseWaBkUserFlowCallbackDelegate/endFailureUserFlow: marker=");
        C18260x0.A1J(A0o, C379224o.A00(i));
    }

    public void B2V(Object obj, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BaseWaBkUserFlowCallbackDelegate/endSuccessUserFlow: marker=");
        C18260x0.A1J(A0o, C379224o.A00(i));
    }

    public void BKV(Object obj, String str, String str2, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BaseWaBkUserFlowCallbackDelegate/markErrorUserFlow: marker=");
        C18260x0.A1J(A0o, C379224o.A00(i));
    }

    public void BKW(Object obj, String str, Map map, int i, int i2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BaseWaBkUserFlowCallbackDelegate/markPointUserFlow: marker=");
        A0o.append(C379224o.A00(i));
        C18260x0.A0q(", point=", str, A0o);
    }

    public void Bq2(Object obj, String str, int i, int i2, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BaseWaBkUserFlowCallbackDelegate/startUserFlow: marker=");
        C18260x0.A1J(A0o, C379224o.A00(i));
    }

    public boolean A00() {
        return false;
    }
}
