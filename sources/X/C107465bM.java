package X;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.SharedPreferences;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.whatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.5bM  reason: invalid class name and case insensitive filesystem */
public class C107465bM {
    public static void A03(View view, C113895mA r2) {
        r2.A0A(false);
        View findViewById = view.findViewById(R.id.out_of_chat_playback_holder);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            r2.A04();
        }
    }

    public static void A04(View view, C113895mA r4, C183538qC r5) {
        r4.A0A(false);
        View findViewById = view.findViewById(R.id.out_of_chat_playback_holder);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            ViewGroup A0l = C86664Kz.A0l(findViewById);
            if (A0l.getLayoutTransition() == null) {
                LayoutTransition layoutTransition = new LayoutTransition();
                layoutTransition.addTransitionListener(new C107725bn(layoutTransition, findViewById, A0l));
                A0l.setLayoutTransition(layoutTransition);
            }
            findViewById.setVisibility(8);
            A09(r4, r5);
        }
    }

    public static void A09(C113895mA r4, C183538qC r5) {
        r4.A0A(false);
        r4.A06();
        r4.A07();
        C106035Xj A1G = C86664Kz.A1G(r5);
        if (A1G.A01) {
            A1G.A06.A07(A1G.A08);
            A1G.A01 = false;
        }
        C86664Kz.A1G(r5).A00 = null;
    }

    public static void A0A(C113895mA r2, C183538qC r3) {
        C30721mu r0;
        synchronized (r2) {
            C116095pj r02 = r2.A00;
            if (r02 != null) {
                r0 = r02.A0N;
            } else {
                r0 = r2.A01;
            }
            r2.A02 = r0;
        }
        r2.A0A(false);
        r2.A06();
        r2.A07();
        C106035Xj A1G = C86664Kz.A1G(r3);
        if (A1G.A01) {
            A1G.A06.A07(A1G.A08);
            A1G.A01 = false;
        }
        C86664Kz.A1G(r3).A00 = null;
    }

    public static Pair A00(Activity activity, View view, View view2, C69263Wi r27, C56972sr r28, C64773Ex r29, AnonymousClass5ZU r30, C105365Uq r31, C114015mM r32, AnonymousClass5RC r33, C113895mA r34, AnonymousClass33p r35, C620733j r36, AnonymousClass1VX r37, AnonymousClass4FS r38, C183538qC r39, C183538qC r40, String str) {
        C105365Uq r11 = r31;
        View view3 = view2;
        Log.d("OutOfChatPlaybackHelper/initOutOfChatPlayback");
        Activity activity2 = activity;
        if (r31 == null) {
            r11 = r32.A06(activity2.getBaseContext(), AnonymousClass000.A0V("out-of-chat-", str, AnonymousClass001.A0o()));
        }
        C620733j r15 = r36;
        AnonymousClass33p r14 = r35;
        C113895mA r13 = r34;
        AnonymousClass5RC r12 = r33;
        C183538qC r2 = r39;
        C56972sr r8 = r28;
        C64773Ex r9 = r29;
        AnonymousClass5ZU r10 = r30;
        if (view2 == null) {
            view3 = C06560Yg.A02(view, R.id.out_of_chat_playback_holder);
            activity2.getLayoutInflater().inflate(R.layout.f8nameremoved, (ViewGroup) view3, true);
            C18310x6.A19(C06560Yg.A02(view3, R.id.out_of_chat_close_btn), r13, r2, 47);
            C06560Yg.A02(view3, R.id.out_of_chat_playback_btn).setOnClickListener(new C109645ex(activity2, view3, r8, r9, r10, r11, r12, r13, r14, r15));
            C18310x6.A19(C06560Yg.A02(view3, R.id.out_of_chat_layout), r13, r2, 48);
        }
        Log.d("OutOfChatPlaybackHelper/setAudioCompletionListener");
        C116095pj A00 = r13.A00();
        if (A00 != null) {
            Log.d("OutOfChatPlaybackHelper/setAudioCompletionListener audio player not null");
            AnonymousClass1VX r16 = r37;
            A00.A0I = new C113105kt(activity2, view3, r27, r8, r9, r10, r11, r12, r13, r14, r15, r16, r38, r40);
            A00.A0C = activity2;
        }
        C116095pj A002 = r13.A00();
        if (A002 != null) {
            A002.A0M = new AnonymousClass7LD(view3, r13, r2);
        }
        A01(view3, r8, r9, r10, r11, r13, r15);
        view3.setVisibility(0);
        C106035Xj A1G = C86664Kz.A1G(r2);
        if (!A1G.A01) {
            A1G.A06.A06(A1G.A08);
            A1G.A01 = true;
        }
        if (r13.A0B()) {
            r13.A05();
        }
        C116095pj A003 = r13.A00();
        if (A003 != null) {
            A003.A0Y = true;
        }
        return AnonymousClass0x9.A0C(view3, r11);
    }

    public static void A0B(AnonymousClass33p r1, C95814uZ r2) {
        SharedPreferences.Editor A03;
        SharedPreferences A0F;
        String str;
        if (r2 != null) {
            if (r2 instanceof AnonymousClass1fS) {
                A03 = C18270x1.A03(r1);
                A0F = AnonymousClass0x2.A0F(r1);
                str = "ptt_out_of_chat_broadcast";
            } else {
                boolean A0K = C627336j.A0K(r2);
                A03 = C18270x1.A03(r1);
                A0F = AnonymousClass0x2.A0F(r1);
                if (A0K) {
                    str = "ptt_out_of_chat_group";
                } else {
                    str = "ptt_out_of_chat_individual";
                }
            }
            C86604Kt.A14(A03, A0F, str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.view.View r16, X.C56972sr r17, X.C64773Ex r18, X.AnonymousClass5ZU r19, X.C105365Uq r20, X.C113895mA r21, X.C620733j r22) {
        /*
            r0 = 2131432002(0x7f0b1242, float:1.848575E38)
            r13 = r16
            com.whatsapp.WaImageButton r3 = X.C86664Kz.A10(r13, r0)
            boolean r0 = r21.A0B()
            if (r0 == 0) goto L_0x01b4
            A05(r3)
        L_0x0012:
            X.5pj r2 = r21.A00()
            X.1mu r11 = r21.A01()
            if (r11 == 0) goto L_0x010e
            r0 = 2131432004(0x7f0b1244, float:1.8485753E38)
            android.view.View r1 = X.C06560Yg.A02(r13, r0)
            com.whatsapp.voicerecorder.VoiceNoteSeekBar r1 = (com.whatsapp.voicerecorder.VoiceNoteSeekBar) r1
            r0 = 0
            r1.setEnabled(r0)
            r1.setLongClickable(r0)
            r0 = 1
            r1.A0A = r0
            if (r2 == 0) goto L_0x0044
            int r0 = r2.A03
            r1.setMax(r0)
            int r0 = r2.A01()
            r1.setProgress(r0)
            X.5kv r0 = new X.5kv
            r0.<init>(r3, r11, r1)
            r2.A0J = r0
        L_0x0044:
            r0 = 2131431999(0x7f0b123f, float:1.8485743E38)
            android.widget.ImageView r10 = X.AnonymousClass0x9.A0E(r13, r0)
            r0 = 2131431997(0x7f0b123d, float:1.848574E38)
            android.view.View r9 = X.C06560Yg.A02(r13, r0)
            r0 = 2131431993(0x7f0b1239, float:1.848573E38)
            android.widget.ImageView r8 = X.AnonymousClass0x9.A0E(r13, r0)
            r0 = 2131431998(0x7f0b123e, float:1.8485741E38)
            android.view.View r7 = X.C06560Yg.A02(r13, r0)
            r0 = 2131431995(0x7f0b123b, float:1.8485735E38)
            android.view.View r6 = X.C06560Yg.A02(r13, r0)
            X.2z0 r5 = r11.A1J
            X.4uZ r14 = r5.A00
            r4 = r14
            boolean r3 = r14 instanceof X.C95804uY
            X.2mS r0 = r11.A0z()
            r2 = 0
            boolean r0 = X.AnonymousClass000.A1W(r0)
            r1 = 8
            r12 = r18
            r16 = r20
            if (r3 != 0) goto L_0x0087
            if (r0 == 0) goto L_0x0140
            X.2mS r0 = r11.A0z()
            X.4uY r14 = r0.A01
        L_0x0087:
            X.C626936e.A06(r14)
            X.4uZ r14 = (X.C95814uZ) r14
            X.3ZH r14 = r12.A0A(r14)
            r0 = r16
            r0.A08(r10, r14)
            r9.setVisibility(r1)
            r8.setVisibility(r1)
            boolean r1 = r11.A25()
            int r0 = X.AnonymousClass001.A08(r1)
            r7.setVisibility(r0)
            if (r1 == 0) goto L_0x00aa
            r2 = 8
        L_0x00aa:
            r6.setVisibility(r2)
        L_0x00ad:
            r0 = 2131432005(0x7f0b1245, float:1.8485755E38)
            com.whatsapp.TextEmojiLabel r2 = X.AnonymousClass0x7.A0K(r13, r0)
            android.content.Context r8 = r13.getContext()
            X.2mS r0 = r11.A0z()
            r7 = 1
            r6 = 0
            boolean r1 = X.AnonymousClass000.A1W(r0)
            boolean r0 = r5.A02
            r5 = r19
            if (r0 == 0) goto L_0x0113
            if (r3 != 0) goto L_0x0113
            if (r1 != 0) goto L_0x0139
            r0 = 2131895597(0x7f12252d, float:1.9426032E38)
            java.lang.String r8 = r8.getString(r0)
        L_0x00d3:
            boolean r0 = X.C627336j.A0K(r4)
            if (r0 == 0) goto L_0x00f6
            if (r4 == 0) goto L_0x00f6
            X.3ZH r0 = r12.A0A(r4)
            java.lang.String r4 = r5.A0I(r0)
            boolean r3 = X.C102805Ki.A00(r22)
            java.lang.String r1 = " • "
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            if (r3 == 0) goto L_0x010f
            X.AnonymousClass001.A1K(r4, r1, r8, r0)
        L_0x00f2:
            java.lang.String r8 = r0.toString()
        L_0x00f6:
            r2.setSelected(r7)
            r1 = 0
            r0 = 100
            r2.A0J(r8, r1, r0, r6)
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            if (r0 == 0) goto L_0x010e
            android.view.ViewTreeObserver r1 = r2.getViewTreeObserver()
            r0 = 13
            X.C86614Ku.A1J(r1, r2, r0)
        L_0x010e:
            return
        L_0x010f:
            X.AnonymousClass001.A1K(r8, r1, r4, r0)
            goto L_0x00f2
        L_0x0113:
            if (r1 != 0) goto L_0x0139
            r1 = r4
            boolean r0 = X.C627336j.A0K(r4)
            if (r0 == 0) goto L_0x0120
            X.4uZ r1 = r11.A0n()
        L_0x0120:
            if (r1 == 0) goto L_0x010e
            X.3ZH r1 = r12.A0A(r1)
            java.lang.String r8 = r5.A0K(r1)
            if (r8 != 0) goto L_0x00d3
            boolean r0 = X.C627336j.A0K(r4)
            int r0 = X.C18280x3.A01(r0)
            java.lang.String r8 = r5.A0R(r1, r0, r6)
            goto L_0x00d3
        L_0x0139:
            X.2mS r0 = r11.A0z()
            X.4uY r1 = r0.A01
            goto L_0x0120
        L_0x0140:
            boolean r0 = r11.A25()
            if (r0 != 0) goto L_0x0160
            r0 = 2131230984(0x7f080108, float:1.8078036E38)
            r10.setImageResource(r0)
            r9.setVisibility(r1)
            r0 = 2131231875(0x7f080483, float:1.8079843E38)
        L_0x0152:
            r8.setImageResource(r0)
            r8.setVisibility(r2)
            r7.setVisibility(r1)
        L_0x015b:
            r6.setVisibility(r1)
            goto L_0x00ad
        L_0x0160:
            int r15 = r11.A09
            r0 = 1
            if (r15 == r0) goto L_0x0182
            java.lang.String r15 = "audio/ogg; codecs=opus"
            java.lang.String r0 = r11.A05
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0182
            boolean r0 = X.C627636p.A0s(r11)
            if (r0 != 0) goto L_0x0182
        L_0x0175:
            r0 = 2131230984(0x7f080108, float:1.8078036E38)
            r10.setImageResource(r0)
            r9.setVisibility(r1)
            r0 = 2131232979(0x7f0808d3, float:1.8082083E38)
            goto L_0x0152
        L_0x0182:
            boolean r0 = r11.A24()
            if (r0 != 0) goto L_0x0175
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x01a5
            X.1RR r0 = X.C56972sr.A01(r17)
            if (r0 == 0) goto L_0x00ad
            X.1RR r14 = X.C56972sr.A01(r17)
        L_0x0196:
            r0 = r16
            r0.A08(r10, r14)
            r9.setVisibility(r1)
            r8.setVisibility(r1)
            r7.setVisibility(r2)
            goto L_0x015b
        L_0x01a5:
            boolean r0 = X.C627336j.A0K(r14)
            if (r0 == 0) goto L_0x01af
            X.4uZ r14 = r11.A0n()
        L_0x01af:
            X.3ZH r14 = X.C64773Ex.A00(r12, r14)
            goto L_0x0196
        L_0x01b4:
            A06(r3)
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107465bM.A01(android.view.View, X.2sr, X.3Ex, X.5ZU, X.5Uq, X.5mA, X.33j):void");
    }

    public static void A02(View view, C113895mA r3) {
        AnonymousClass7LD r1;
        C116095pj A00 = r3.A00();
        if (A00 != null && view != null && (r1 = A00.A0M) != null && r1.A00 == view) {
            r1.A00 = null;
        }
    }

    public static void A05(ImageButton imageButton) {
        imageButton.setImageResource(R.drawable.inline_audio_pause);
        C18300x5.A13(imageButton.getContext(), imageButton, R.string.f11nameremoved);
    }

    public static void A06(ImageButton imageButton) {
        C18290x4.A1A(imageButton.getContext(), imageButton, R.drawable.inline_audio_play);
        C18300x5.A13(imageButton.getContext(), imageButton, R.string.f11nameremoved);
    }

    public static void A07(C113895mA r1) {
        C116095pj A00 = r1.A00();
        if (A00 != null) {
            A00.A0C = null;
        }
    }

    public static void A08(C113895mA r2, AnonymousClass33p r3, C95814uZ r4) {
        if (r2.A0B()) {
            synchronized (r2) {
                C116095pj r1 = r2.A00;
                if (r1 != null) {
                    r1.A0Z = false;
                    r1.A0o.A00();
                }
            }
            r2.A0A(true);
            A0B(r3, r4);
        }
    }
}
