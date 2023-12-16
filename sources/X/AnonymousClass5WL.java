package X;

import android.view.ViewGroup;
import android.widget.ScrollView;
import com.whatsapp.status.playback.widget.StatusEditText;
import com.whatsapp.util.Log;

/* renamed from: X.5WL  reason: invalid class name */
public class AnonymousClass5WL {
    public int A00;
    public C152967aS A01;
    public AnonymousClass52Q A02 = null;
    public String A03;
    public boolean A04 = false;
    public boolean A05;
    public final ViewGroup A06;
    public final ScrollView A07;
    public final AnonymousClass08M A08;
    public final C151257Ua A09;
    public final AnonymousClass4UA A0A;
    public final C620633i A0B;
    public final AnonymousClass487 A0C;
    public final AnonymousClass5Y0 A0D;
    public final C95814uZ A0E;
    public final C106685Zz A0F;
    public final C50022hV A0G;
    public final C60152y5 A0H;
    public final AnonymousClass7SV A0I;
    public final AnonymousClass2X0 A0J;
    public final C113995mK A0K;
    public final StatusEditText A0L;
    public final C150617Rm A0M;
    public final C116145po A0N;

    public static final int A00(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        if (charSequence == null) {
            Log.e("textstatus/linecount/str-null");
        } else {
            int length = charSequence.length();
            if (i < 0 || i2 > length || i > i2) {
                throw new IndexOutOfBoundsException();
            }
            while (i < i2) {
                if (charSequence.charAt(i) == 10) {
                    i3++;
                }
                i++;
            }
        }
        return i3;
    }

    public AnonymousClass5WL(ViewGroup viewGroup, ScrollView scrollView, AnonymousClass08M r4, C151257Ua r5, AnonymousClass4UA r6, C620633i r7, AnonymousClass487 r8, AnonymousClass5Y0 r9, C95814uZ r10, C106685Zz r11, C50022hV r12, C60152y5 r13, AnonymousClass7SV r14, AnonymousClass2X0 r15, C113995mK r16, StatusEditText statusEditText, C150617Rm r18, C116145po r19) {
        this.A0F = r11;
        this.A0D = r9;
        this.A0G = r12;
        this.A0B = r7;
        this.A09 = r5;
        this.A0J = r15;
        this.A0E = r10;
        this.A06 = viewGroup;
        this.A0I = r14;
        this.A0C = r8;
        this.A0L = statusEditText;
        this.A0M = r18;
        this.A0A = r6;
        this.A08 = r4;
        this.A0H = r13;
        this.A07 = scrollView;
        this.A0N = r19;
        this.A0K = r16;
    }
}
