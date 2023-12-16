package X;

import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.conversation.conversationrow.MessageSelectionViewModel;
import com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;
import com.whatsapp.gallery.MediaGalleryActivity;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import java.util.Collection;

/* renamed from: X.685  reason: invalid class name */
public class AnonymousClass685 extends C113145kx {
    public Object A00;
    public final int A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass685(X.C89644eZ r12, X.C64773Ex r13, X.AnonymousClass5ZU r14, X.AnonymousClass5RO r15, X.AnonymousClass654 r16, X.AnonymousClass655 r17, X.C104555Rk r18, X.C113245l7 r19, X.C620733j r20, X.AnonymousClass5Y0 r21, X.AnonymousClass1VX r22, java.lang.Integer r23) {
        /*
            r11 = this;
            r0 = 3
            r2 = r11
            r11.A01 = r0
            r0 = r19
            r11.A00 = r0
            r3 = r12
            r4 = r13
            r5 = r14
            r9 = r20
            X.C18260x0.A0c(r12, r13, r14, r9)
            r6 = r15
            r8 = r18
            X.C18260x0.A0U(r15, r8)
            r10 = r21
            r1 = r22
            X.C86634Kw.A1S(r1, r10)
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r0 = r16
            r11.A00 = r0
            r0 = r23
            r11.A02 = r0
            r11.A01 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass685.<init>(X.4eZ, X.3Ex, X.5ZU, X.5RO, X.654, X.655, X.5Rk, X.5l7, X.33j, X.5Y0, X.1VX, java.lang.Integer):void");
    }

    public void A00() {
        MessageSelectionViewModel messageSelectionViewModel;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                messageSelectionViewModel = ((MediaAlbumActivity) obj).A0A;
                break;
            case 1:
                messageSelectionViewModel = ((C93544ok) obj).A08;
                break;
            case 2:
                messageSelectionViewModel = (MessageSelectionViewModel) ((ReportToAdminMessagesActivity) obj).A0C.getValue();
                break;
            case 3:
                messageSelectionViewModel = ((C113245l7) obj).A2q;
                break;
            case 4:
                ((MediaGalleryActivity) obj).B3M();
                return;
            case 5:
                AnonymousClass0R2 r0 = ((MyStatusesActivity) obj).A01;
                if (r0 != null) {
                    r0.A05();
                    return;
                }
                return;
            default:
                ((StorageUsageGalleryActivity) obj).B3M();
                return;
        }
        messageSelectionViewModel.A0D();
    }

    public Collection BCf() {
        AnonymousClass5QO r0;
        switch (this.A01) {
            case 2:
                r0 = ((C93354oN) this.A00).A00.A03();
                break;
            case 3:
                C113245l7 r1 = (C113245l7) this.A00;
                if (r1.A2z.getSelectedMessages() != null) {
                    r0 = r1.A2z.getSelectedMessages();
                    break;
                } else {
                    return null;
                }
            case 4:
                r0 = ((MediaGalleryActivity) this.A00).A0I;
                break;
            case 5:
                return ((MyStatusesActivity) this.A00).A11.values();
            case 6:
                r0 = ((StorageUsageGalleryActivity) this.A00).A0E;
                break;
            default:
                C93334oL r12 = (C93334oL) this.A00;
                if (r12.A00.A03() != null) {
                    r0 = r12.A00.A03();
                    break;
                } else {
                    return null;
                }
        }
        if (r0 == null) {
            return null;
        }
        return r0.A00();
    }

    public boolean BLz(MenuItem menuItem, AnonymousClass0R2 r10) {
        if (3 - this.A01 == 0) {
            C113245l7 r2 = (C113245l7) this.A00;
            if (r2.A2z.getSelectedMessages() == null || r2.A2z.getSelectedMessages().A04.size() == 0) {
                return true;
            }
            AnonymousClass5W1 r5 = r2.A2g;
            int itemId = menuItem.getItemId();
            C94724ro A002 = AnonymousClass5W1.A00(r2.A2z.getSelectedMessages(), r2.A4J, 2);
            int i = 2;
            if (itemId != R.id.menuitem_overflow) {
                int i2 = 3;
                if (itemId != 8) {
                    i = 4;
                    if (itemId != 21) {
                        i = 5;
                        if (itemId != 1) {
                            if (itemId == 12) {
                                i = 6;
                            } else if (itemId == 2 || itemId == 3) {
                                i = 7;
                            } else {
                                i = 8;
                                if (itemId != 5) {
                                    i = 9;
                                    if (itemId != 15) {
                                        i2 = 11;
                                        if (itemId == 11) {
                                            i = 10;
                                        } else if (itemId != 4) {
                                            i = 1;
                                            if (itemId == 9) {
                                                i = 12;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i = i2;
            }
            A002.A04 = Integer.valueOf(i);
            r5.A02.BhD(A002);
        }
        return super.BLz(menuItem, r10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass685(X.C64773Ex r11, X.AnonymousClass5ZU r12, com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity r13, X.C93644ow r14, X.AnonymousClass5RO r15, X.C93754pF r16, X.C620733j r17, X.AnonymousClass5Y0 r18) {
        /*
            r10 = this;
            r0 = 2
            r1 = r10
            r10.A01 = r0
            r2 = r13
            r10.A00 = r13
            r9 = r18
            X.C162457s7.A0H(r9)
            r3 = r11
            X.C162457s7.A0H(r11)
            r4 = r12
            X.C162457s7.A0H(r12)
            r8 = r17
            X.C162457s7.A0H(r8)
            r6 = r14
            r5 = r15
            r7 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass685.<init>(X.3Ex, X.5ZU, com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity, X.4ow, X.5RO, X.4pF, X.33j, X.5Y0):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass685(C89644eZ r1, C64773Ex r2, AnonymousClass5ZU r3, AnonymousClass5RO r4, AnonymousClass655 r5, C104555Rk r6, C620733j r7, AnonymousClass5Y0 r8, Object obj, int i) {
        super(r1, r2, r3, r4, r5, r6, r7, r8);
        this.A01 = i;
        this.A00 = obj;
    }
}
