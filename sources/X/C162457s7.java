package X;

import android.os.Parcel;
import android.view.View;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.Stack;
import org.json.JSONObject;

/* renamed from: X.7s7  reason: invalid class name and case insensitive filesystem */
public class C162457s7 {
    public static UserJid A01(UserJid userJid, C162047r8 r3) {
        PhoneUserJid phoneUserJid;
        C27981fH A01;
        A0J(userJid, 0);
        if (!(userJid instanceof PhoneUserJid) || (phoneUserJid = (PhoneUserJid) userJid) == null || (A01 = r3.A07.A01(phoneUserJid)) == null) {
            return userJid;
        }
        return A01;
    }

    public static AnonymousClass5UY A02(View view, int i) {
        A0J(view, 0);
        View A02 = C06560Yg.A02(view, i);
        A0D(A02);
        return new AnonymousClass5UY(A02);
    }

    public static Object A04(JSONObject jSONObject) {
        A0J(jSONObject, 0);
        Object obj = jSONObject.get("variable");
        A0D(obj);
        return obj;
    }

    public static String A07(JSONObject jSONObject) {
        A0J(jSONObject, 0);
        String string = jSONObject.getString("variable");
        A0D(string);
        return string;
    }

    public static void A08(Parcel parcel) {
        A0J(parcel, 0);
        parcel.readInt();
    }

    public static int A00(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }

    public static RuntimeException A05() {
        AnonymousClass700 r0 = new AnonymousClass700();
        A0O(r0);
        throw r0;
    }

    public static void A09(Object obj) {
        if (obj == null) {
            IllegalStateException A0I = AnonymousClass000.A0I(" must not be null", AnonymousClass000.A0l("INVOKE_RETURN"));
            A0O(A0I);
            throw A0I;
        }
    }

    public static void A0A(Object obj) {
        if (obj == null) {
            A0L("ARRAY_ELEMENT");
            throw AnonymousClass000.A0L();
        }
    }

    public static void A0B(Object obj) {
        if (obj == null) {
            A0L("CHECK_CAST");
            throw AnonymousClass000.A0L();
        }
    }

    public static void A0C(Object obj) {
        if (obj == null) {
            A0L("INSTANCE_FIELD");
            throw AnonymousClass000.A0L();
        }
    }

    public static void A0D(Object obj) {
        if (obj == null) {
            A0L("INVOKE_RETURN");
            throw AnonymousClass000.A0L();
        }
    }

    public static void A0E(Object obj) {
        if (obj == null) {
            A0L("LOAD_PARAM");
            throw AnonymousClass000.A0L();
        }
    }

    public static void A0F(Object obj) {
        if (obj == null) {
            A0L("STATIC_FIELD");
            throw AnonymousClass000.A0L();
        }
    }

    public static void A0G(Object obj) {
        if (obj == null) {
            A0L("UNKNOWN");
            throw AnonymousClass000.A0L();
        }
    }

    public static void A0H(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            A0O(nullPointerException);
            throw nullPointerException;
        }
    }

    public static void A0I(Object obj, int i) {
        if (obj == null) {
            IllegalArgumentException A0c = AnonymousClass001.A0c(A06(AnonymousClass000.A0V("param at index = ", Integer.toString(i), AnonymousClass001.A0o())));
            A0O(A0c);
            throw A0c;
        }
    }

    public static void A0J(Object obj, int i) {
        if (obj == null) {
            NullPointerException A0g = AnonymousClass001.A0g(A06(AnonymousClass000.A0V("param at index = ", Integer.toString(i), AnonymousClass001.A0o())));
            A0O(A0g);
            throw A0g;
        }
    }

    public static void A0K(Object obj, String str) {
        if (obj == null) {
            NullPointerException A0g = AnonymousClass001.A0g(str);
            A0O(A0g);
            throw A0g;
        }
    }

    public static void A0O(Throwable th) {
        A0N(C162457s7.class.getName(), th);
    }

    public static boolean A0P(Object obj, Object obj2) {
        if (obj == null) {
            return AnonymousClass000.A1X(obj2);
        }
        return obj.equals(obj2);
    }

    public static Object A03(Stack stack) {
        Object peek = stack.peek();
        A0D(peek);
        return peek;
    }

    public static String A06(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = C162457s7.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Parameter specified as non-null is null: method ");
        A0o.append(className);
        A0o.append(".");
        A0o.append(methodName);
        return AnonymousClass000.A0V(", parameter ", str, A0o);
    }

    public static void A0L(String str) {
        NullPointerException A0V = AnonymousClass0x2.A0V(" must not be null", AnonymousClass000.A0l(str));
        A0O(A0V);
        throw A0V;
    }

    public static void A0M(String str) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("lateinit property ");
        A0o.append(str);
        AnonymousClass8RY r0 = new AnonymousClass8RY(AnonymousClass000.A0X(" has not been initialized", A0o));
        A0O(r0);
        throw r0;
    }

    public static void A0N(String str, Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }
}
