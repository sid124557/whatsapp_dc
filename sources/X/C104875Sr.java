package X;

import java.util.List;

/* renamed from: X.5Sr  reason: invalid class name and case insensitive filesystem */
public final class C104875Sr {
    public final int A00;
    public final C149727Nq A01;
    public final C150477Qw A02;
    public final List A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104875Sr) {
                C104875Sr r5 = (C104875Sr) obj;
                if (!C162457s7.A0P(this.A01, r5.A01) || !C162457s7.A0P(this.A03, r5.A03) || this.A05 != r5.A05 || this.A04 != r5.A04 || !C162457s7.A0P(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0x2.A01(AnonymousClass0x2.A01(AnonymousClass000.A08(this.A03, C18300x5.A04(this.A01)), this.A05), this.A04) + AnonymousClass000.A07(this.A02);
    }

    public C104875Sr(C149727Nq r2, C150477Qw r3, List list, boolean z, boolean z2) {
        this.A01 = r2;
        this.A03 = list;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = r3;
        this.A00 = r2.A00;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AudioChatBottomSheetViewState(title=");
        A0o.append(this.A01);
        A0o.append(", buttonViewStates=");
        A0o.append(this.A03);
        A0o.append(", shouldShowParticipantList=");
        A0o.append(this.A05);
        A0o.append(", shouldShowConfirmation=");
        A0o.append(this.A04);
        A0o.append(", countdownText=");
        return C18260x0.A04(this.A02, A0o);
    }
}
