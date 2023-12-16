package X;

import java.util.AbstractMap;
import java.util.Map;

/* renamed from: X.9e0  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C197869e0 implements C84114Bb {
    public final /* synthetic */ C52792m3 A00;
    public final /* synthetic */ AnonymousClass9Bw A01;

    public final void BSV(Object obj) {
        Object obj2;
        Object obj3;
        C52792m3 r4 = this.A00;
        C198009eE r6 = (C198009eE) obj;
        Map map = r6.A02;
        if (map != null && map.containsKey("error") && "onLoadingFailure".equals(r6.A00) && (obj2 = map.get("error")) != null && (obj3 = ((AbstractMap) obj2).get("code")) != null) {
            AnonymousClass9Bw.A0c(r4, (Map) null, AnonymousClass001.A0K(obj3));
        }
    }

    public /* synthetic */ C197869e0(C52792m3 r1, AnonymousClass9Bw r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
