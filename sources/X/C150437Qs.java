package X;

import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7Qs  reason: invalid class name and case insensitive filesystem */
public class C150437Qs {
    public Object A00(String str, Class cls) {
        Object obj;
        Object obj2;
        Object obj3;
        Object r5;
        Throwable th;
        Object obj4;
        C162457s7.A0J(cls, 1);
        C149527Mu r3 = AnonymousClass79J.A03;
        try {
            obj = r3.A03.Br1(str);
        } catch (Throwable th2) {
            obj = new AnonymousClass3Z0(th2);
        }
        if (obj instanceof AnonymousClass3Z0) {
            r5 = new AnonymousClass3Z0(new C135076k5("Parsing error", new Throwable[]{AnonymousClass3Z9.A00(obj)}));
        } else {
            C57682u2.A01(obj);
            try {
                obj2 = r3.A02.Br1(obj);
            } catch (Throwable th3) {
                obj2 = new AnonymousClass3Z0(th3);
            }
            try {
                obj3 = r3.A00.Br1(obj);
            } catch (Throwable th4) {
                obj3 = new AnonymousClass3Z0(th4);
            }
            boolean z = obj2 instanceof AnonymousClass3Z0;
            if ((!z) && (!(obj3 instanceof AnonymousClass3Z0))) {
                C57682u2.A01(obj3);
                C57682u2.A01(obj2);
            } else if (z && (obj3 instanceof AnonymousClass3Z0)) {
                r5 = new AnonymousClass3Z0(new C135076k5("Failed to parse both 'data' and 'errors'", new Throwable[]{AnonymousClass3Z9.A00(obj3), AnonymousClass3Z9.A00(obj2)}));
            } else if (obj3 instanceof AnonymousClass3Z0) {
                Throwable A00 = AnonymousClass3Z9.A00(obj3);
                C57682u2.A01(obj2);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("Failed to parse ");
                A0o.append("data");
                r5 = new AnonymousClass3Z0(new C135076k5(obj2, AnonymousClass000.A0P(A00, " response due to ", A0o), "data", A00, 472));
            } else {
                C57682u2.A01(obj3);
                obj2 = r3.A01.Br1(AnonymousClass3Z9.A00(obj2));
            }
            r5 = new C51762kL(obj3, obj2);
        }
        if (!(r5 instanceof AnonymousClass3Z0)) {
            C57682u2.A01(r5);
            C51762kL r52 = (C51762kL) r5;
            Object A002 = r52.A00();
            C162457s7.A0J(A002, 0);
            try {
                obj4 = AnonymousClass6C9.A0b(cls, A002, new Class[]{JSONObject.class});
            } catch (Throwable th5) {
                obj4 = new AnonymousClass3Z0(th5);
            }
            if (!(obj4 instanceof AnonymousClass3Z0)) {
                C57682u2.A01(obj4);
                return new C27871eo((C153197aq) obj4, (JSONArray) r52.A01());
            }
            th = new C135056k3(cls, AnonymousClass3Z9.A00(obj4));
        } else {
            th = AnonymousClass3Z9.A00(r5);
            if (th == null) {
                th = new C135076k5((String) null, new Throwable[]{new UnknownError()});
            }
        }
        return new AnonymousClass3Z0(th);
    }
}
