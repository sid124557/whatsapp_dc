package X;

import java.lang.ref.WeakReference;

/* renamed from: X.5Sh  reason: invalid class name and case insensitive filesystem */
public final class C104775Sh {
    public final long A00;
    public final C157857j0 A01;
    public final AnonymousClass5RP A02;
    public final Integer A03;
    public final WeakReference A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C104775Sh) {
                C104775Sh r8 = (C104775Sh) obj;
                if (this.A00 != r8.A00 || !C162457s7.A0P(this.A01, r8.A01) || !C162457s7.A0P(this.A04, r8.A04) || !C162457s7.A0P(this.A02, r8.A02) || !C162457s7.A0P(this.A03, r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A00;
        return AnonymousClass000.A08(this.A02, AnonymousClass000.A08(this.A04, AnonymousClass000.A08(this.A01, ((int) (j ^ (j >>> 32))) * 31))) + AnonymousClass000.A07(this.A03);
    }

    public C104775Sh(C157857j0 r1, AnonymousClass5RP r2, Integer num, WeakReference weakReference, long j) {
        this.A00 = j;
        this.A01 = r1;
        this.A04 = weakReference;
        this.A02 = r2;
        this.A03 = num;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("EmojiLoadingTask(emojiDescriptor=");
        A0o.append(this.A00);
        A0o.append(", emojiSequence=");
        A0o.append(this.A01);
        A0o.append(", emojiImageViewRef=");
        A0o.append(this.A04);
        A0o.append(", tag=");
        A0o.append(this.A02);
        A0o.append(", qplInstanceKey=");
        return C18260x0.A04(this.A03, A0o);
    }
}
