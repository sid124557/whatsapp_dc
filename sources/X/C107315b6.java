package X;

import android.content.ClipData;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.5b6  reason: invalid class name and case insensitive filesystem */
public class C107315b6 {
    public static AnonymousClass7IU A00(Context context, C15810ry r20, TextEmojiLabel textEmojiLabel, AnonymousClass8GU r22, C620633i r23, AnonymousClass5Y0 r24, C106195Xz r25, C60152y5 r26, C624134x r27, String str, byte b, float f, boolean z, boolean z2) {
        float f2 = f;
        TextEmojiLabel textEmojiLabel2 = textEmojiLabel;
        if (f > 0.0f) {
            textEmojiLabel2.setTextSize(f2);
        }
        String charSequence = C107575bX.A03(str).toString();
        SpannableStringBuilder A00 = C18330xA.A00(charSequence);
        C620633i r7 = r23;
        C60152y5 r8 = r26;
        if (z && !z2) {
            C107635bd.A07(r7, r8, A00);
        }
        AnonymousClass8GU r12 = r22;
        SpannableStringBuilder spannableStringBuilder = A00;
        C107345b9.A00(textEmojiLabel2.getContext(), textEmojiLabel2.getPaint(), r12, r24, spannableStringBuilder, 1.3f);
        boolean A09 = A09(textEmojiLabel2.getContext(), spannableStringBuilder, r20, charSequence, b, r12.A02);
        Context context2 = context;
        if (context != null) {
            C624134x r4 = r27;
            if (r27 != null) {
                C106195Xz r5 = r25;
                if (r25 != null) {
                    r5.A05(context2, A00, r4.A1J.A00, r4.A18);
                }
            }
        }
        if (z && z2) {
            C107635bd.A04(textEmojiLabel2.getPaint(), r7, r8, A00, AnonymousClass0Y8.A04(textEmojiLabel2.getContext(), R.color.f5nameremoved), AnonymousClass0Y8.A04(textEmojiLabel2.getContext(), R.color.f5nameremoved), false);
        }
        return new AnonymousClass7IU(A00, Boolean.valueOf(A09));
    }

    public static boolean A09(Context context, SpannableStringBuilder spannableStringBuilder, C15810ry r8, String str, byte b, int i) {
        int charCount;
        if (i <= 0 || i >= spannableStringBuilder.length() || b == 78 || (charCount = (i + Character.charCount(str.codePointAt(i - 1))) - 1) == spannableStringBuilder.length()) {
            return false;
        }
        spannableStringBuilder.delete(charCount, spannableStringBuilder.length());
        SpannableStringBuilder A00 = C18330xA.A00(context.getString(R.string.f11nameremoved));
        A00.setSpan(r8.get(), 0, A00.length(), 18);
        spannableStringBuilder.append("... ");
        spannableStringBuilder.append(A00);
        return true;
    }

    public static String A02(Context context, C620733j r7, C30821nD r8) {
        BigDecimal bigDecimal;
        String str = r8.A05;
        if (str == null || (bigDecimal = r8.A0A) == null) {
            return null;
        }
        return C86614Ku.A0s(context, new C160617ny(str).A04(r7, bigDecimal, true), new Object[1], R.string.f11nameremoved);
    }

    public static boolean A0A(C56972sr r4, C64773Ex r5, C56982ss r6, C66473Lo r7, AnonymousClass1VX r8, C66493Lq r9, C624134x r10, C56572sD r11) {
        AnonymousClass3ZH r52;
        AnonymousClass2z0 r2 = r10.A1J;
        if (r2.A02) {
            return true;
        }
        C95814uZ r3 = r2.A00;
        C626936e.A06(r3);
        if (r11.A00(r3) == 1 || (r10 instanceof AnonymousClass1p5)) {
            return true;
        }
        AnonymousClass3ZH A01 = r7.A01(r3);
        if (A01.A0U()) {
            C95814uZ A0n = r10.A0n();
            if (A0n == null) {
                return false;
            }
            AnonymousClass3ZH A0A = r5.A0A(A0n);
            Class<C27991fJ> cls = C27991fJ.class;
            UserJid A0D = r5.A0D((GroupJid) A01.A0I(cls));
            if (A0D != null) {
                r52 = r5.A0A(A0D);
            } else {
                r52 = null;
            }
            PhoneUserJid A05 = C56972sr.A05(r4);
            if (r9.A0b.A0G((C27991fJ) AnonymousClass3ZH.A05(A01, cls))) {
                return true;
            }
            if ((r52 == null || (r52.A0F == null && !A05.equals(r52.A0H))) && A0A.A0F == null && A0A.A08 != 3) {
                return false;
            }
            return true;
        } else if (A01.A0F != null || A01.A08 == 3) {
            return true;
        } else {
            C95814uZ r1 = A01.A0H;
            if (r1 instanceof C95804uY) {
                AnonymousClass1RL r12 = (AnonymousClass1RL) r6.A0A(r1, false);
                if (r12 == null) {
                    return false;
                }
                if (r12.A0L() || !AnonymousClass000.A1Y(r12.A07, C372821q.GUEST)) {
                    return true;
                }
                return r8.A0X(3209);
            } else if ((r3 instanceof AnonymousClass1fW) || (r3 instanceof C135216kJ)) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static AnonymousClass66v A01(Context context) {
        AnonymousClass66v inlineVideoPlaybackHandler;
        AnonymousClass67A A01 = AnonymousClass31N.A01(context);
        if (A01 == null || (inlineVideoPlaybackHandler = A01.getInlineVideoPlaybackHandler()) == null) {
            return new C116495qN();
        }
        return inlineVideoPlaybackHandler;
    }

    public static String A03(C620733j r5, C30821nD r6) {
        int i = r6.A00;
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, i);
        return r5.A0L(A0L, R.plurals.f9nameremoved, (long) i);
    }

    public static String A04(C624134x r2) {
        StringBuilder A0o = AnonymousClass001.A0o();
        C624134x.A0S(r2, "date-transition-", A0o);
        return A0o.toString();
    }

    public static String A05(Object obj) {
        return A06(obj.toString());
    }

    public static String A06(String str) {
        return AnonymousClass000.A0V("thumb-transition-", str, AnonymousClass001.A0o());
    }

    public static void A07(Context context, C69263Wi r11, C56972sr r12, C64773Ex r13, AnonymousClass5ZU r14, C620633i r15, C620733j r16, C106195Xz r17, C60152y5 r18, C50222hp r19, Collection collection) {
        String A13;
        String A01;
        HashSet A0K = AnonymousClass002.A0K();
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (!A0T.A1r(8) || C40802Hu.A01(A0T) == null) {
                byte b = A0T.A1I;
                if (b == 0 || b == 32 || b == 46) {
                    A13 = A0T.A13();
                } else {
                    A13 = null;
                    if (A0T instanceof AnonymousClass4DV) {
                        AnonymousClass315 A012 = r19.A01((AnonymousClass4DV) A0T);
                        if (A012 != null) {
                            A13 = A012.A06();
                        }
                    } else if (A0T instanceof C30771mz) {
                        A13 = ((C30771mz) A0T).A23();
                    } else if (A0T instanceof AnonymousClass1nF) {
                        A13 = ((AnonymousClass1nF) A0T).A01;
                    } else if (A0T instanceof C30471mV) {
                        A13 = ((C30471mV) A0T).A1w();
                    } else if (A0T instanceof AnonymousClass1p5) {
                        A13 = ((AnonymousClass1p5) A0T).A20();
                    }
                }
            } else {
                A13 = AnonymousClass353.A02(C40802Hu.A01(A0T), A0T.A13());
            }
            if (!TextUtils.isEmpty(A13)) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                if (A0o.length() != 0) {
                    A0o3.append(10);
                }
                if (collection.size() > 1) {
                    A0o3.append('[');
                    A0o3.append(DateUtils.formatDateTime(context, A0T.A0K, 655377));
                    if (C624134x.A08(A0T, "] ", A0o3).A02) {
                        A01 = r12.A0D.A03();
                    } else {
                        A01 = AnonymousClass5ZU.A01(r13, r14, A0T.A0o());
                    }
                    A0o3.append(A01);
                    A0o3.append(": ");
                }
                A0o.append(A0o3);
                A0o2.append(A0o3);
                A0o2.append(A13);
                if (A0T.A18 != null) {
                    A0o.append(r17.A02(context, A0T, A13));
                    A0K.addAll(A0T.A18);
                } else {
                    A0o.append(A13);
                }
            }
        }
        String obj = A0o.toString();
        SharedPreferences.Editor A00 = C60152y5.A00(r18, C58152un.A0A);
        if (!A0K.isEmpty()) {
            A00.putString("copied_message", obj);
            A00.putString("copied_message_without_mentions", A0o2.toString());
            A00.putString("copied_message_jids", C624435a.A01(A0K));
        } else {
            A00.remove("copied_message");
            A00.remove("copied_message_without_mentions");
            A00.remove("copied_message_jids");
        }
        A00.apply();
        try {
            r15.A0C().setPrimaryClip(ClipData.newPlainText(obj, obj));
            if (collection.size() == 1) {
                r11.A0H(R.string.f11nameremoved, 0);
                return;
            }
            long size = (long) collection.size();
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, collection.size(), 0);
            r11.A0P(r16.A0L(objArr, R.plurals.f9nameremoved, size), 0);
        } catch (NullPointerException | SecurityException e) {
            Log.e("conversation/copymessage/npe", e);
            r11.A0H(R.string.f11nameremoved, 0);
        }
    }

    public static void A08(View view, Object obj) {
        AnonymousClass0YZ.A0F(view, A06(obj.toString()));
    }
}
