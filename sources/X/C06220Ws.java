package X;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.0Ws  reason: invalid class name and case insensitive filesystem */
public class C06220Ws {
    public static final C06220Ws A04 = new C06220Ws(64, (CharSequence) null);
    public static final C06220Ws A05 = new C06220Ws(128, (CharSequence) null);
    public static final C06220Ws A06 = new C06220Ws(2, (CharSequence) null);
    public static final C06220Ws A07 = new C06220Ws(8, (CharSequence) null);
    public static final C06220Ws A08 = new C06220Ws(16, (CharSequence) null);
    public static final C06220Ws A09 = new C06220Ws(524288, (CharSequence) null);
    public static final C06220Ws A0A;
    public static final C06220Ws A0B = new C06220Ws(16384, (CharSequence) null);
    public static final C06220Ws A0C = new C06220Ws(65536, (CharSequence) null);
    public static final C06220Ws A0D = new C06220Ws(1048576, (CharSequence) null);
    public static final C06220Ws A0E;
    public static final C06220Ws A0F;
    public static final C06220Ws A0G;
    public static final C06220Ws A0H = new C06220Ws(262144, (CharSequence) null);
    public static final C06220Ws A0I = new C06220Ws(1, (CharSequence) null);
    public static final C06220Ws A0J;
    public static final C06220Ws A0K;
    public static final C06220Ws A0L = new C06220Ws(32, (CharSequence) null);
    public static final C06220Ws A0M;
    public static final C06220Ws A0N;
    public static final C06220Ws A0O;
    public static final C06220Ws A0P;
    public static final C06220Ws A0Q;
    public static final C06220Ws A0R;
    public static final C06220Ws A0S;
    public static final C06220Ws A0T = new C06220Ws(32768, (CharSequence) null);
    public static final C06220Ws A0U;
    public static final C06220Ws A0V;
    public static final C06220Ws A0W;
    public static final C06220Ws A0X = new C06220Ws((int) DefaultCrypto.BUFFER_SIZE, (CharSequence) null);
    public static final C06220Ws A0Y;
    public static final C06220Ws A0Z = new C06220Ws((int) ZipDecompressor.UNZIP_BUFFER_SIZE, (CharSequence) null);
    public static final C06220Ws A0a;
    public static final C06220Ws A0b;
    public static final C06220Ws A0c;
    public static final C06220Ws A0d;
    public static final C06220Ws A0e = new C06220Ws(4, (CharSequence) null);
    public static final C06220Ws A0f;
    public static final C06220Ws A0g = new C06220Ws(AnonymousClass06U.class, (int) AnonymousClass35S.A0F);
    public static final C06220Ws A0h = new C06220Ws(AnonymousClass06V.class, 2097152);
    public static final C06220Ws A0i;
    public static final C06220Ws A0j;
    public static final C06220Ws A0k;
    public final int A00;
    public final C15860s4 A01;
    public final Class A02;
    public final Object A03;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18 = null;
        Class<AnonymousClass06P> cls = AnonymousClass06P.class;
        A0N = new C06220Ws((Class) cls, 256);
        A0V = new C06220Ws((Class) cls, 512);
        Class<AnonymousClass06Q> cls2 = AnonymousClass06Q.class;
        A0O = new C06220Ws((Class) cls2, (int) EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        A0W = new C06220Ws((Class) cls2, (int) EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        A0i = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction, 16908342);
        if (i >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction2 = null;
        }
        A0c = new C06220Ws((C15860s4) null, (CharSequence) null, AnonymousClass06S.class, accessibilityAction2, 16908343);
        if (i >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19 = null;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20 = null;
        A0d = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction3, 16908344);
        if (i >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction4 = null;
        }
        A0a = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction4, 16908345);
        if (i >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction5 = null;
        }
        A0Y = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction5, 16908346);
        if (i >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        A0b = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction6, 16908347);
        if (i >= 29) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21 = null;
        A0S = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction18, 16908358);
        if (i >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction7 = null;
        }
        A0P = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction7, 16908359);
        if (i >= 29) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction8 = null;
        }
        A0Q = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction8, 16908360);
        if (i >= 29) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        }
        A0R = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction21, 16908361);
        if (i >= 23) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction9 = null;
        }
        A0A = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction9, 16908348);
        if (i >= 24) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        } else {
            accessibilityAction10 = null;
        }
        A0f = new C06220Ws((C15860s4) null, (CharSequence) null, AnonymousClass06T.class, accessibilityAction10, 16908349);
        if (i >= 26) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction11 = null;
        }
        A0M = new C06220Ws((C15860s4) null, (CharSequence) null, AnonymousClass06R.class, accessibilityAction11, 16908354);
        if (i >= 28) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction12 = null;
        }
        A0k = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction12, 16908356);
        if (i >= 28) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction13 = null;
        }
        A0J = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction13, 16908357);
        if (i >= 30) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction14 = null;
        }
        A0U = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction14, 16908362);
        if (i >= 30) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction15 = null;
        }
        A0K = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction15, 16908372);
        if (i >= 32) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction16 = null;
        }
        A0G = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction16, 16908373);
        if (i >= 32) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction17 = null;
        }
        A0F = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction17, 16908374);
        if (i >= 32) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        }
        A0E = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction19, 16908375);
        if (i >= 33) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        }
        A0j = new C06220Ws((C15860s4) null, (CharSequence) null, (Class) null, accessibilityAction20, 16908376);
    }

    public C06220Ws(int i, CharSequence charSequence) {
        this((C15860s4) null, charSequence, (Class) null, (Object) null, i);
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C06220Ws) && this.A03.equals(((C06220Ws) obj).A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccessibilityActionCompat: ");
        String A002 = C05650Ui.A00(this.A00);
        if (A002.equals("ACTION_UNKNOWN")) {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction) this.A03;
            if (accessibilityAction.getLabel() != null) {
                A002 = accessibilityAction.getLabel().toString();
            }
        }
        return AnonymousClass000.A0X(A002, A0o);
    }

    public C06220Ws(C15860s4 r1, CharSequence charSequence, Class cls, Object obj, int i) {
        this.A00 = i;
        this.A01 = r1;
        this.A03 = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
        this.A02 = cls;
    }

    public C06220Ws(Class cls, int i) {
        this((C15860s4) null, (CharSequence) null, cls, (Object) null, i);
    }
}
