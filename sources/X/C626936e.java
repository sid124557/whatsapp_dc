package X;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.36e  reason: invalid class name and case insensitive filesystem */
public class C626936e {
    public static ConditionVariable A00 = new ConditionVariable();
    public static volatile Boolean A01;

    public static void A04(View view) {
        A07(view, "");
    }

    public static void A05(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            Log.d("empty string");
            throw AnonymousClass001.A0c("");
        }
    }

    public static void A06(Object obj) {
        A07(obj, "");
    }

    public static void A07(Object obj, String str) {
        if (obj == null) {
            Log.d("unexpected null");
            throw AnonymousClass001.A0g(str);
        }
    }

    public static void A09(String str, Collection collection) {
        if (collection == null || collection.isEmpty()) {
            throw AnonymousClass001.A0c(str);
        }
    }

    public static void A0B(boolean z) {
        A0E(z, "");
    }

    public static void A0C(boolean z) {
        A0F(z, "");
    }

    public static void A0D(boolean z, String str) {
        if (!z) {
            Log.e((Throwable) AnonymousClass0x9.A0i(str));
        }
    }

    public static void A0E(boolean z, String str) {
        if (!z) {
            throw AnonymousClass001.A0c(str);
        }
    }

    public static void A0F(boolean z, String str) {
        if (!z) {
            throw AnonymousClass001.A0e(str);
        }
    }

    public static void A0G(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            throw AnonymousClass001.A0c("");
        }
    }

    public static void A0H(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            throw AnonymousClass001.A0c("");
        }
    }

    public static void A00() {
        A0D(!C615631i.A02(), "should not be run in main thread");
    }

    public static void A01() {
        A0D(C615631i.A02(), "should be run in ui main thread");
    }

    public static void A02(Handler handler) {
        A0C(AnonymousClass000.A1Y(handler.getLooper(), Looper.myLooper()));
    }

    public static void A03(HandlerThread handlerThread) {
        A0C(AnonymousClass000.A1Y(handlerThread.getLooper(), Looper.myLooper()));
    }

    public static void A08(String str, Throwable th) {
        A06(th);
        A06(str);
        Log.e(str, th);
    }

    public static void A0A(Throwable th) {
        A06(th);
        Log.e(th);
    }
}
