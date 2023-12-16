package X;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.common.thread.ThreadUtil;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* renamed from: X.0gV  reason: invalid class name and case insensitive filesystem */
public class C09630gV implements C15440rL {
    public int A00;
    public AnonymousClass03C A01;
    public AnonymousClass03D A02;
    public AnonymousClass0Og A03;
    public AnonymousClass0Oh A04;
    public AnonymousClass00P A05;
    public C142906xz A06;
    public Integer A07;
    public Runnable A08;
    public boolean A09 = false;
    public final Deque A0A = new ArrayDeque();
    public final List A0B = AnonymousClass001.A0s();

    public final void A04(Context context) {
        Deque deque = this.A0A;
        C04190Ne r1 = (C04190Ne) deque.pop();
        A02(A00());
        if (this.A01 != null) {
            r1.A03.A05();
            this.A0B.add(r1);
            C04190Ne r4 = (C04190Ne) deque.peek();
            if (r4 == null) {
                throw AnonymousClass001.A0e("Cannot pop Screen content with an empty CDS bottom sheet or full screen.");
            } else if (this.A01 != null) {
                AnonymousClass0Oh r2 = this.A04;
                if (r2 != null) {
                    r2.A02.post(new C11210jH(r2));
                }
                AnonymousClass0Og r22 = this.A03;
                if (r22 != null) {
                    r22.A02.post(new C11200jG(r22));
                }
                C04670Qe r3 = r4.A03;
                View view = r4.A00;
                if (view == null) {
                    view = r3.A01(context);
                }
                r4.A00 = view;
                this.A01.A01.A02(view, (AnonymousClass0GI) null, false);
                View A002 = r3.A00();
                AnonymousClass03C r0 = this.A01;
                if (r0 != null) {
                    ViewGroup viewGroup = r0.A00;
                    viewGroup.removeAllViews();
                    viewGroup.addView(A002);
                }
            } else {
                throw AnonymousClass001.A0e("Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
            }
        } else {
            throw AnonymousClass001.A0e("Cannot pop Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
        }
    }

    public final int A00() {
        C04190Ne r0 = (C04190Ne) this.A0A.peek();
        if (r0 != null) {
            return r0.A02;
        }
        C159737mN.A01("CDSBloksBottomSheetDelegate", "Attempting to check the current keyboard soft input mode but found null.");
        return 32;
    }

    public void A01(int i) {
        AnonymousClass03D r0;
        Handler handler;
        Runnable r2;
        AnonymousClass0Oh r02;
        AnonymousClass03D r1 = this.A02;
        if (r1 != null) {
            r1.A05(AnonymousClass719.A00(), i);
        }
        if (i == 0) {
            AnonymousClass0Oh r12 = this.A04;
            if (r12 != null && (r0 = this.A02) != null) {
                handler = r12.A02;
                r2 = new C12140l4(r0, r12);
            } else {
                return;
            }
        } else if (i != 5) {
            if (i == 6 && (r02 = this.A04) != null) {
                handler = r02.A02;
                r2 = new C11210jH(r02);
            } else {
                return;
            }
        } else if (this.A03 != null && this.A02 != null) {
            AnonymousClass0Oh r22 = this.A04;
            if (r22 != null) {
                r22.A02.post(new C11210jH(r22));
            }
            ThreadUtil.runOnUiThread(new C11190jF(this));
            AnonymousClass0Og r13 = this.A03;
            AnonymousClass03D r03 = this.A02;
            handler = r13.A02;
            r2 = new C12130l3(r03, r13);
        } else {
            return;
        }
        handler.post(r2);
    }

    public final void A02(int i) {
        Context context;
        Window window;
        C04190Ne r0 = (C04190Ne) this.A0A.peek();
        if (r0 != null) {
            context = r0.A03.A01;
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.getWindow() != null) {
                window = activity.getWindow();
            } else {
                return;
            }
        } else {
            AnonymousClass00P r02 = this.A05;
            if (r02 == null || (window = r02.getWindow()) == null) {
                return;
            }
        }
        window.setSoftInputMode(i);
    }

    public void A03(Context context) {
        C181528mu A002;
        AnonymousClass03C r0 = this.A01;
        if (!(r0 == null || r0.getVisibility() == 0)) {
            this.A01.setVisibility(0);
        }
        Deque deque = this.A0A;
        C04190Ne r02 = (C04190Ne) deque.peek();
        if (r02 != null && (A002 = r02.A00()) != null) {
            A002.BND();
        } else if (deque.size() > 1) {
            A04(context);
        } else {
            AnonymousClass00P r03 = this.A05;
            if (r03 != null) {
                r03.dismiss();
            }
        }
    }

    public final void A05(Context context, C04670Qe r5, AnonymousClass0GI r6, C181528mu r7, int i) {
        if (this.A01 != null) {
            View A012 = r5.A01(context);
            this.A01.A01.A02(A012, r6, true);
            View A002 = r5.A00();
            AnonymousClass03C r0 = this.A01;
            if (r0 != null) {
                ViewGroup viewGroup = r0.A00;
                viewGroup.removeAllViews();
                viewGroup.addView(A002);
            }
            this.A0A.push(new C04190Ne(A012, r5, r7, i));
            A02(A00());
            return;
        }
        throw AnonymousClass001.A0e("Cannot push Screen content without initializing the CDS bottom sheet. Please call onCreateDialog() and onCreateView().");
    }

    public void A06(Context context, String str) {
        String str2;
        Deque deque = this.A0A;
        if (deque.isEmpty() || this.A01 == null) {
            str2 = "Cannot pop from an empty bottom sheet.";
        } else if (deque.size() == 1) {
            str2 = "Attempting to pop to the root screen in the CDS bottom sheet or full screen, so no pop action was performed. This is a no-op.";
        } else if (str == null) {
            A04(context);
            return;
        } else {
            A07(context, str);
            return;
        }
        C159737mN.A01("CDSBloksBottomSheetDelegate", str2);
    }

    public void A07(Context context, String str) {
        String str2;
        Deque<C04190Ne> deque = this.A0A;
        C04190Ne r0 = (C04190Ne) deque.peekFirst();
        if (r0 == null || str.equals(r0.A03.A03)) {
            str2 = "Attempting to pop to the current screen in the CDS bottom sheet, so no pop action was performed. This is a no-op.";
        } else {
            int i = 0;
            for (C04190Ne r02 : deque) {
                if (!str.equals(r02.A03.A03)) {
                    i++;
                } else {
                    for (int i2 = 0; i2 < i; i2++) {
                        A04(context);
                    }
                    return;
                }
            }
            str2 = "No screen found with target ID, so no screens were popped.";
        }
        C159737mN.A01("CDSBloksBottomSheetDelegate", str2);
    }
}
