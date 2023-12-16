package X;

import android.os.CountDownTimer;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.InteractiveMessageView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5R6  reason: invalid class name */
public class AnonymousClass5R6 {
    public CountDownTimer A00;
    public C147227Dh A01;
    public C103955Pb A02;
    public C182258o7 A03;
    public Long A04 = null;
    public String A05 = null;
    public String A06 = null;
    public String A07 = null;
    public boolean A08 = false;
    public boolean A09 = false;
    public final C69263Wi A0A;
    public final C56612sH A0B;
    public final C53552nH A0C;
    public final AnonymousClass4FS A0D;
    public final SimpleDateFormat A0E;
    public final SimpleDateFormat A0F;
    public final SimpleDateFormat A0G;

    public final void A00() {
        C103955Pb r2;
        int i;
        String valueOf;
        long longValue = this.A04.longValue();
        C56612sH r3 = this.A0B;
        long A0H = longValue - r3.A0H();
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        long convert = timeUnit.convert(A0H, timeUnit2);
        if (convert >= 14) {
            Date date = new Date(this.A04.longValue());
            r2 = this.A02;
            i = R.string.f11nameremoved;
            valueOf = this.A0E.format(date);
        } else if (convert > 1) {
            r2 = this.A02;
            i = R.string.f11nameremoved;
            valueOf = String.valueOf(convert);
        } else if (convert <= 1) {
            long convert2 = TimeUnit.HOURS.convert(A0H, timeUnit2);
            if (convert2 <= 48) {
                Date date2 = new Date(r3.A0H());
                Date date3 = new Date(this.A04.longValue());
                C103955Pb r22 = this.A02;
                SimpleDateFormat simpleDateFormat = this.A0G;
                boolean equals = simpleDateFormat.format(date3).equals(simpleDateFormat.format(date2));
                int i2 = R.string.f11nameremoved;
                if (equals) {
                    i2 = R.string.f11nameremoved;
                }
                r22.A00(this.A0F.format(date3), i2, true, false);
            }
            if (convert2 < 1) {
                InteractiveMessageView interactiveMessageView = this.A02.A00;
                AnonymousClass0x2.A0q(interactiveMessageView.getContext(), interactiveMessageView.A05, R.color.f5nameremoved);
                return;
            }
            return;
        } else {
            return;
        }
        r2.A00(valueOf, i, true, false);
    }

    public boolean A01() {
        Long l;
        if (!this.A09 || !this.A08 || (l = this.A04) == null || l.longValue() - this.A0B.A0H() >= 0) {
            return false;
        }
        return true;
    }

    public AnonymousClass5R6(C69263Wi r4, C56612sH r5, C620733j r6, C53552nH r7, AnonymousClass4FS r8) {
        this.A0B = r5;
        this.A0A = r4;
        this.A0D = r8;
        this.A0C = r7;
        this.A0E = new SimpleDateFormat("MMM dd", C620733j.A02(r6));
        this.A0F = new SimpleDateFormat("hh:mm a", C620733j.A02(r6));
        this.A0G = AnonymousClass0x7.A0u("yyyy MM dd");
    }
}
