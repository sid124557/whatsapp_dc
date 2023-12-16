package X;

import android.view.View;

/* renamed from: X.5Xk  reason: invalid class name and case insensitive filesystem */
public final class C106045Xk {
    public final View.OnClickListener A00;
    public final View.OnLongClickListener A01;
    public final View.OnTouchListener A02;
    public final C31981pC A03;
    public final C33141sV A04;
    public final C183348pt A05;
    public final Runnable A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C106045Xk) {
                C106045Xk r5 = (C106045Xk) obj;
                if (!C162457s7.A0P(this.A03, r5.A03) || this.A08 != r5.A08 || this.A0B != r5.A0B || this.A07 != r5.A07 || this.A0A != r5.A0A || this.A09 != r5.A09 || this.A0C != r5.A0C || !C162457s7.A0P(this.A04, r5.A04) || !C162457s7.A0P(this.A06, r5.A06) || !C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A02, r5.A02) || !C162457s7.A0P(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00(AnonymousClass1VX r2) {
        if (!this.A0A || !this.A0B || !this.A07 || this.A09) {
            return false;
        }
        if (this.A08) {
            return this.A0C;
        }
        return r2.A0X(3482);
    }

    public int hashCode() {
        return ((((((((((AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass000.A07(this.A03) * 31, this.A08), this.A0B), this.A07), this.A0A), this.A09), this.A0C) + AnonymousClass000.A07(this.A04)) * 31) + AnonymousClass000.A07(this.A06)) * 31) + AnonymousClass000.A07(this.A00)) * 31) + AnonymousClass000.A07(this.A01)) * 31) + AnonymousClass000.A07(this.A02)) * 31) + C18310x6.A07(this.A05);
    }

    public C106045Xk(View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, View.OnTouchListener onTouchListener, C31981pC r4, C33141sV r5, C183348pt r6, Runnable runnable, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A03 = r4;
        this.A08 = z;
        this.A0B = z2;
        this.A07 = z3;
        this.A0A = z4;
        this.A09 = z5;
        this.A0C = z6;
        this.A04 = r5;
        this.A06 = runnable;
        this.A00 = onClickListener;
        this.A01 = onLongClickListener;
        this.A02 = onTouchListener;
        this.A05 = r6;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("UiState(message=");
        A0o.append(this.A03);
        A0o.append(", isActive=");
        A0o.append(this.A08);
        A0o.append(", isMediaTransferSuccessful=");
        A0o.append(this.A0B);
        A0o.append(", canPlayPtv=");
        A0o.append(this.A07);
        A0o.append(", isAttached=");
        A0o.append(this.A0A);
        A0o.append(", isAnimating=");
        A0o.append(this.A09);
        A0o.append(", playWhenReadyAndActive=");
        A0o.append(this.A0C);
        A0o.append(", messageThumbCache=");
        A0o.append(this.A04);
        A0o.append(", onFileReadError=");
        A0o.append(this.A06);
        A0o.append(", onClickListener=");
        A0o.append(this.A00);
        A0o.append(", onLongClickListener=");
        A0o.append(this.A01);
        A0o.append(", onTouchListener=");
        A0o.append(this.A02);
        A0o.append(", playerStateChangedListener=");
        return C18260x0.A04(this.A05, A0o);
    }

    public C106045Xk() {
        this((View.OnClickListener) null, (View.OnLongClickListener) null, (View.OnTouchListener) null, (C31981pC) null, (C33141sV) null, (C183348pt) null, (Runnable) null, false, false, false, false, false, false);
    }
}
