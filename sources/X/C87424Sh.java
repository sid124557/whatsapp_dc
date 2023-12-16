package X;

import android.content.Context;
import android.util.AttributeSet;
import com.whatsapp.CopyableTextView;
import com.whatsapp.FAQTextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.biz.catalog.view.AvailabilityStateTextView;
import com.whatsapp.biz.catalog.view.EllipsizedTextEmojiLabel;
import com.whatsapp.conversation.comments.ContactName;
import com.whatsapp.conversation.comments.DecryptionFailureMessageView;
import com.whatsapp.conversation.comments.MessageDate;
import com.whatsapp.conversation.comments.MessageText;
import com.whatsapp.conversation.comments.RevokedMessageText;
import com.whatsapp.conversation.comments.SuspiciousLinkView;
import com.whatsapp.storage.SizeTickerView;
import com.whatsapp.text.AutoSizeTextView;
import com.whatsapp.text.CondensedTextView;
import com.whatsapp.text.TrimmedMultiLineTextView;
import com.whatsapp.ui.media.MediaCaptionTextView;

/* renamed from: X.4Sh  reason: invalid class name and case insensitive filesystem */
public abstract class C87424Sh extends AnonymousClass03n implements AnonymousClass4GJ {
    public C116855qy A00;
    public boolean A01;

    public static void A03(C64333Db r1, TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A01 = (C620733j) r1.AbU.get();
        textEmojiLabel.A02 = (AnonymousClass1VX) r1.A07.get();
        textEmojiLabel.A0B = (AnonymousClass5Y0) r1.A8o.get();
        textEmojiLabel.A09 = (C620633i) r1.AYG.get();
        textEmojiLabel.A0C = (C60152y5) r1.AVn.get();
    }

    public static void A04(C64333Db r1, WaTextView waTextView) {
        waTextView.A01 = (C620733j) r1.AbU.get();
        waTextView.A02 = (AnonymousClass1VX) r1.A07.get();
    }

    public static void A05(C107695bk r0, TextEmojiLabel textEmojiLabel) {
        textEmojiLabel.A0A = (AnonymousClass487) r0.A9c.get();
    }

    public void A08() {
        if (this instanceof TrimmedMultiLineTextView) {
            TrimmedMultiLineTextView trimmedMultiLineTextView = (TrimmedMultiLineTextView) this;
            if (!trimmedMultiLineTextView.A01) {
                trimmedMultiLineTextView.A01 = true;
                A04(A02(trimmedMultiLineTextView), trimmedMultiLineTextView);
            }
        } else if (this instanceof CondensedTextView) {
            CondensedTextView condensedTextView = (CondensedTextView) this;
            if (!condensedTextView.A02) {
                condensedTextView.A02 = true;
                A04(A02(condensedTextView), condensedTextView);
            }
        } else if (this instanceof AutoSizeTextView) {
            AutoSizeTextView autoSizeTextView = (AutoSizeTextView) this;
            if (!autoSizeTextView.A03) {
                autoSizeTextView.A03 = true;
                A04(A02(autoSizeTextView), autoSizeTextView);
            }
        } else if (this instanceof SizeTickerView) {
            SizeTickerView sizeTickerView = (SizeTickerView) this;
            if (!sizeTickerView.A07) {
                sizeTickerView.A07 = true;
                A04(A02(sizeTickerView), sizeTickerView);
            }
        } else if (this instanceof SuspiciousLinkView) {
            SuspiciousLinkView suspiciousLinkView = (SuspiciousLinkView) this;
            if (!suspiciousLinkView.A00) {
                suspiciousLinkView.A00 = true;
                A04(A02(suspiciousLinkView), suspiciousLinkView);
            }
        } else if (this instanceof MessageDate) {
            MessageDate messageDate = (MessageDate) this;
            if (!messageDate.A01) {
                messageDate.A01 = true;
                C64333Db A02 = A02(messageDate);
                A04(A02, messageDate);
                messageDate.A00 = C64333Db.A2p(A02);
            }
        } else if (this instanceof C89814fA) {
            C89814fA r2 = (C89814fA) this;
            if (!r2.A00) {
                r2.A00 = true;
                AvailabilityStateTextView availabilityStateTextView = (AvailabilityStateTextView) r2;
                C88864av r1 = (C88864av) ((C111685iW) r2.generatedComponent());
                A04(r1.A0K, availabilityStateTextView);
                availabilityStateTextView.A0E(new C86794Lv((C102785Kg) r1.A01.get()));
            }
        } else if (this instanceof C89824fB) {
            C89824fB r3 = (C89824fB) this;
            if (r3 instanceof C89384cj) {
                C89384cj r32 = (C89384cj) r3;
                if (r32 instanceof MediaCaptionTextView) {
                    MediaCaptionTextView mediaCaptionTextView = (MediaCaptionTextView) r32;
                    if (!mediaCaptionTextView.A01) {
                        mediaCaptionTextView.A01 = true;
                        C64333Db A022 = A02(mediaCaptionTextView);
                        A03(A022, mediaCaptionTextView);
                        A05(A022.A00, mediaCaptionTextView);
                        mediaCaptionTextView.A00 = C86634Kw.A0m(A022);
                    }
                } else if (!r32.A00) {
                    r32.A00 = true;
                    C64333Db A023 = A02(r32);
                    A03(A023, r32);
                    A05(A023.A00, r32);
                }
            } else if (r3 instanceof C89404cs) {
                C89404cs r33 = (C89404cs) r3;
                if (!r33.A01) {
                    r33.A01 = true;
                    C64333Db A024 = A02(r33);
                    A03(A024, r33);
                    A05(A024.A00, r33);
                    r33.A00 = (C625735q) A024.AYF.get();
                }
            } else if (r3 instanceof C89394cr) {
                C89394cr r34 = (C89394cr) r3;
                if (!r34.A01) {
                    r34.A01 = true;
                    C64333Db A025 = A02(r34);
                    A03(A025, r34);
                    A05(A025.A00, r34);
                    r34.A00 = (C625735q) A025.AYF.get();
                }
            } else if (r3 instanceof RevokedMessageText) {
                RevokedMessageText revokedMessageText = (RevokedMessageText) r3;
                if (!revokedMessageText.A02) {
                    revokedMessageText.A02 = true;
                    C64333Db A026 = A02(revokedMessageText);
                    A03(A026, revokedMessageText);
                    A05(A026.A00, revokedMessageText);
                    revokedMessageText.A00 = C64333Db.A06(A026);
                    revokedMessageText.A01 = C64333Db.A28(A026);
                }
            } else if (r3 instanceof MessageText) {
                MessageText messageText = (MessageText) r3;
                if (!messageText.A0F) {
                    messageText.A0F = true;
                    C88864av r22 = (C88864av) ((C111685iW) messageText.generatedComponent());
                    C64333Db r4 = r22.A0K;
                    A03(r4, messageText);
                    C107695bk r12 = r4.A00;
                    A05(r12, messageText);
                    messageText.A08 = C64333Db.A39(r4);
                    messageText.A02 = C64333Db.A26(r4);
                    messageText.A09 = C86634Kw.A0f(r4);
                    messageText.A03 = C86624Kv.A0Q(r4);
                    messageText.A0A = C64333Db.A5A(r4);
                    messageText.A05 = r22.A4G();
                    messageText.A0D = (C106625Zs) r12.A73.get();
                    messageText.A01 = C64333Db.A06(r4);
                    messageText.A06 = r22.A4I();
                    messageText.A0C = (C56572sD) r4.AWF.get();
                    messageText.A07 = r22.A4J();
                }
            } else if (r3 instanceof DecryptionFailureMessageView) {
                DecryptionFailureMessageView decryptionFailureMessageView = (DecryptionFailureMessageView) r3;
                if (!decryptionFailureMessageView.A09) {
                    decryptionFailureMessageView.A09 = true;
                    C64333Db A027 = A02(decryptionFailureMessageView);
                    A03(A027, decryptionFailureMessageView);
                    C107695bk r13 = A027.A00;
                    A05(r13, decryptionFailureMessageView);
                    decryptionFailureMessageView.A01 = C64333Db.A04(A027);
                    decryptionFailureMessageView.A08 = C18280x3.A0Q(r13);
                    decryptionFailureMessageView.A00 = C64333Db.A00(A027);
                    decryptionFailureMessageView.A02 = C64333Db.A05(A027);
                    decryptionFailureMessageView.A03 = C64333Db.A06(A027);
                    decryptionFailureMessageView.A04 = C64333Db.A28(A027);
                    decryptionFailureMessageView.A06 = C86604Kt.A0e(A027);
                    decryptionFailureMessageView.A05 = C64333Db.A2s(A027);
                    decryptionFailureMessageView.A07 = A027.ArS();
                }
            } else if (r3 instanceof ContactName) {
                ContactName contactName = (ContactName) r3;
                if (!contactName.A0A) {
                    contactName.A0A = true;
                    C64333Db A028 = A02(contactName);
                    A03(A028, contactName);
                    A05(A028.A00, contactName);
                    contactName.A00 = C64333Db.A04(A028);
                    contactName.A01 = C64333Db.A06(A028);
                    contactName.A08 = C64333Db.A8y(A028);
                    contactName.A06 = C64333Db.A39(A028);
                    contactName.A04 = C64333Db.A28(A028);
                    contactName.A03 = C64333Db.A26(A028);
                    contactName.A05 = C86624Kv.A0Q(A028);
                    contactName.A09 = C69723Yd.A00();
                    contactName.A07 = C64333Db.A3G(A028);
                    contactName.A02 = C86614Ku.A0N(A028);
                }
            } else if (r3 instanceof EllipsizedTextEmojiLabel) {
                EllipsizedTextEmojiLabel ellipsizedTextEmojiLabel = (EllipsizedTextEmojiLabel) r3;
                if (!ellipsizedTextEmojiLabel.A02) {
                    ellipsizedTextEmojiLabel.A02 = true;
                    C64333Db A029 = A02(ellipsizedTextEmojiLabel);
                    A03(A029, ellipsizedTextEmojiLabel);
                    A05(A029.A00, ellipsizedTextEmojiLabel);
                }
            } else if (r3 instanceof FAQTextView) {
                FAQTextView fAQTextView = (FAQTextView) r3;
                if (!fAQTextView.A03) {
                    fAQTextView.A03 = true;
                    C64333Db A0210 = A02(fAQTextView);
                    A03(A0210, fAQTextView);
                    C107695bk r14 = A0210.A00;
                    A05(r14, fAQTextView);
                    fAQTextView.A00 = C64333Db.A04(A0210);
                    fAQTextView.A02 = r14.APo();
                    fAQTextView.A01 = C64333Db.A05(A0210);
                }
            } else if (!r3.A00) {
                r3.A00 = true;
                TextEmojiLabel textEmojiLabel = (TextEmojiLabel) r3;
                C64333Db r0 = ((C88864av) ((C111685iW) r3.generatedComponent())).A0K;
                A03(r0, textEmojiLabel);
                A05(r0.A00, textEmojiLabel);
            }
        } else if (this instanceof CopyableTextView) {
            CopyableTextView copyableTextView = (CopyableTextView) this;
            if (!copyableTextView.A04) {
                copyableTextView.A04 = true;
                C64333Db A0211 = A02(copyableTextView);
                A04(A0211, copyableTextView);
                copyableTextView.A00 = C64333Db.A04(A0211);
                copyableTextView.A01 = C64333Db.A2o(A0211);
            }
        } else if (!this.A01) {
            this.A01 = true;
            A04(((C88864av) ((C111685iW) generatedComponent())).A0K, (WaTextView) this);
        }
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A00;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public C87424Sh(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A08();
    }

    public static C64333Db A02(C87424Sh r0) {
        return ((C88864av) ((C111685iW) r0.generatedComponent())).A0K;
    }

    public static void A06(AutoSizeTextView autoSizeTextView) {
        autoSizeTextView.A08();
        autoSizeTextView.A00 = 0.0f;
        autoSizeTextView.A01 = 0.0f;
        autoSizeTextView.A02 = 0;
        autoSizeTextView.A04 = null;
    }

    public C87424Sh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A08();
    }

    public C87424Sh(Context context) {
        super(context, (AttributeSet) null);
        A08();
    }
}
