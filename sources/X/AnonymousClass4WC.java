package X;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.emoji.EmojiDescriptor;
import com.whatsapp.expressionstray.emoji.handler.EmojiHandlerImageView;
import com.whatsapp.expressionstray.emoji.view.EmojiImageView;
import java.util.Iterator;

/* renamed from: X.4WC  reason: invalid class name */
public final class AnonymousClass4WC extends AnonymousClass09G {
    public static final AnonymousClass0O4 A08 = new C1231067d(2);
    public final int A00;
    public final int A01;
    public final Paint A02;
    public final AnonymousClass5OY A03;
    public final C104185Pz A04;
    public final AnonymousClass1VX A05;
    public final AnonymousClass4GR A06;
    public final AnonymousClass4GR A07;

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 0) {
            return new AnonymousClass4r8(C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved));
        }
        if (i == 1) {
            View inflate = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
            Paint paint = this.A02;
            AnonymousClass4GR r9 = this.A07;
            AnonymousClass4GR r10 = this.A06;
            AnonymousClass5OY r8 = this.A03;
            C162457s7.A0H(inflate);
            return new C94394rB(paint, inflate, r8, r9, r10);
        } else if (i == 2) {
            return new C94384r9(this.A02, C18300x5.A0F(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved), this.A07, this.A06);
        } else if (i == 3) {
            View inflate2 = C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
            C162457s7.A0K(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) inflate2;
            boolean A0X = this.A05.A0X(6606);
            int i2 = this.A01;
            for (int i3 = 0; i3 < i2; i3++) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, this.A00, 1.0f);
                LayoutInflater A0D = C18280x3.A0D(viewGroup);
                int i4 = R.layout.f8nameremoved;
                if (A0X) {
                    i4 = R.layout.f8nameremoved;
                }
                viewGroup2.addView(A0D.inflate(i4, viewGroup2, false), layoutParams);
            }
            return new AnonymousClass4rA(this.A02, viewGroup2, this.A03, this.A07, this.A06);
        } else {
            throw AnonymousClass001.A0e("Unknown view type.");
        }
    }

    public AnonymousClass4WC(Paint paint, AnonymousClass5OY r3, C104185Pz r4, AnonymousClass1VX r5, AnonymousClass4GR r6, AnonymousClass4GR r7, int i, int i2) {
        super(A08);
        this.A05 = r5;
        this.A03 = r3;
        this.A02 = paint;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = r4;
        this.A07 = r6;
        this.A06 = r7;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r22, int i) {
        C104185Pz r3;
        int intValue;
        String str;
        int[] iArr;
        AnonymousClass699 r0;
        AnonymousClass699 r02;
        AnonymousClass699 r03;
        AnonymousClass699 r04;
        int i2 = i;
        AnonymousClass4Xn r32 = (AnonymousClass4Xn) r22;
        C162457s7.A0J(r32, 0);
        AnonymousClass5MX r2 = (AnonymousClass5MX) A0K(i2);
        if (r2 instanceof C94404rD) {
            if (r32 instanceof C94384r9) {
                C94404rD r23 = (C94404rD) r2;
                Integer num = r23.A02;
                if (num != null) {
                    this.A04.A00(num.intValue(), "emoji_handler_view_bind_start", (String) null);
                }
                C94384r9 r33 = (C94384r9) r32;
                EmojiHandlerImageView emojiHandlerImageView = r33.A00;
                int[] iArr2 = r23.A04;
                emojiHandlerImageView.A00(num, iArr2);
                C109715f4.A00(emojiHandlerImageView, r33, r23, i2, 6);
                if (C107425bI.A03(iArr2) || C107425bI.A02(iArr2)) {
                    emojiHandlerImageView.setLongClickable(true);
                    r04 = new AnonymousClass699(r33, r23, i2, 1);
                } else {
                    emojiHandlerImageView.setLongClickable(false);
                    r04 = null;
                }
                emojiHandlerImageView.setOnLongClickListener(r04);
                if (num != null) {
                    r3 = this.A04;
                    intValue = num.intValue();
                    str = "emoji_handler_view_bind_end";
                } else {
                    return;
                }
            } else if (r32 instanceof C94394rB) {
                C94404rD r24 = (C94404rD) r2;
                Integer num2 = r24.A02;
                if (num2 != null) {
                    this.A04.A00(num2.intValue(), "emoji_view_bind_start", (String) null);
                }
                C94394rB r34 = (C94394rB) r32;
                int[] iArr3 = r24.A04;
                C94274qr r8 = new C94274qr(iArr3);
                long A002 = EmojiDescriptor.A00(r8, false);
                AnonymousClass5OY r7 = r34.A01;
                EmojiImageView emojiImageView = r34.A00;
                r7.A00(r8, emojiImageView, num2, A002);
                C109715f4.A00(emojiImageView, r34, r24, i2, 9);
                if (C107425bI.A03(iArr3) || C107425bI.A02(iArr3)) {
                    emojiImageView.setLongClickable(true);
                    r03 = new AnonymousClass699(r34, r24, i2, 4);
                } else {
                    emojiImageView.setLongClickable(false);
                    r03 = null;
                }
                emojiImageView.setOnLongClickListener(r03);
                if (num2 != null) {
                    r3 = this.A04;
                    intValue = num2.intValue();
                    str = "emoji_view_bind_end";
                } else {
                    return;
                }
            } else {
                throw AnonymousClass001.A0e(AnonymousClass000.A0P(r32, "Impossible to bind EmojiItem to ", AnonymousClass001.A0o()));
            }
        } else if (r2 instanceof AnonymousClass4rC) {
            AnonymousClass4rC r25 = (AnonymousClass4rC) r2;
            C162457s7.A0J(r25, 0);
            C86614Ku.A0I(r32.A0H).setText(r25.A00);
            return;
        } else if (r2 instanceof AnonymousClass4rE) {
            AnonymousClass4rE r26 = (AnonymousClass4rE) r2;
            Integer num3 = r26.A02;
            if (num3 != null) {
                this.A04.A00(num3.intValue(), "emoji_row_bind_start", (String) null);
            }
            AnonymousClass4rA r35 = (AnonymousClass4rA) r32;
            int i3 = i * this.A01;
            View view = r35.A0H;
            C162457s7.A0K(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            C162457s7.A0J(viewGroup, 0);
            Iterator A11 = C86634Kw.A11(viewGroup);
            int i4 = 0;
            while (A11.hasNext()) {
                Object next = A11.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    throw C18280x3.A0X();
                }
                View view2 = (View) next;
                EmojiImageView emojiImageView2 = (EmojiImageView) view2.findViewById(R.id.emoji);
                EmojiHandlerImageView emojiHandlerImageView2 = (EmojiHandlerImageView) view2.findViewById(R.id.emoji_handler);
                int[][] iArr4 = r26.A04;
                C162457s7.A0J(iArr4, 0);
                if (i4 > iArr4.length - 1 || (iArr = iArr4[i4]) == null) {
                    view2.setVisibility(4);
                } else {
                    view2.setVisibility(0);
                    Integer num4 = null;
                    if (emojiImageView2 != null) {
                        emojiImageView2.setPaint(r35.A00);
                        int i6 = i3 + i4;
                        if (i4 == 0) {
                            num4 = num3;
                        }
                        C94274qr r05 = new C94274qr(iArr);
                        EmojiImageView emojiImageView3 = emojiImageView2;
                        C94274qr r16 = r05;
                        r35.A01.A00(r16, emojiImageView3, num4, EmojiDescriptor.A00(r05, false));
                        C109715f4.A00(emojiImageView2, r35, iArr, i6, 7);
                        if (C107425bI.A03(iArr) || C107425bI.A02(iArr)) {
                            emojiImageView2.setLongClickable(true);
                            r02 = new AnonymousClass699(r35, iArr, i6, 2);
                        } else {
                            emojiImageView2.setLongClickable(false);
                            r02 = null;
                        }
                        emojiImageView2.setOnLongClickListener(r02);
                    } else if (emojiHandlerImageView2 != null) {
                        emojiHandlerImageView2.setPaint(r35.A00);
                        int i7 = i3 + i4;
                        if (i4 == 0) {
                            num4 = num3;
                        }
                        emojiHandlerImageView2.A00(num4, iArr);
                        C109715f4.A00(emojiHandlerImageView2, r35, iArr, i7, 8);
                        if (C107425bI.A03(iArr) || C107425bI.A02(iArr)) {
                            emojiHandlerImageView2.setLongClickable(true);
                            r0 = new AnonymousClass699(r35, iArr, i7, 3);
                        } else {
                            emojiHandlerImageView2.setLongClickable(false);
                            r0 = null;
                        }
                        emojiHandlerImageView2.setOnLongClickListener(r0);
                    }
                }
                i4 = i5;
            }
            if (num3 != null) {
                r3 = this.A04;
                intValue = num3.intValue();
                str = "emoji_row_bind_end";
            } else {
                return;
            }
        } else {
            return;
        }
        r3.A00(intValue, str, (String) null);
    }

    public int getItemViewType(int i) {
        Object A0K = A0K(i);
        if (A0K instanceof AnonymousClass4rE) {
            return 3;
        }
        if (A0K instanceof C94404rD) {
            return C18280x3.A00(this.A05.A0X(6606) ? 1 : 0);
        }
        if (A0K instanceof AnonymousClass4rC) {
            return 0;
        }
        throw C73153f1.A00();
    }
}
