package X;

import com.whatsapp.R;
import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;

/* renamed from: X.3R4  reason: invalid class name */
public class AnonymousClass3R4 implements AnonymousClass4FE, C83924Ai {
    public final /* synthetic */ ChatTransferViewModel A00;

    public AnonymousClass3R4(ChatTransferViewModel chatTransferViewModel) {
        this.A00 = chatTransferViewModel;
    }

    public void BSb(int i) {
        ChatTransferViewModel chatTransferViewModel = this.A00;
        chatTransferViewModel.A00 = i;
        int i2 = 50;
        if (chatTransferViewModel.A0R.A05()) {
            i2 = 98;
        }
        chatTransferViewModel.A0K(R.string.f11nameremoved, 0 + ((i * (100 - i2)) / 100));
        if (chatTransferViewModel.A02 != 0) {
            chatTransferViewModel.A02 = 0;
        }
    }

    public void BUR(int i, int i2) {
        ChatTransferViewModel chatTransferViewModel = this.A00;
        int i3 = (i * 100) / i2;
        chatTransferViewModel.A00 = i3;
        int i4 = 50;
        if (chatTransferViewModel.A0R.A05()) {
            i4 = 98;
        }
        chatTransferViewModel.A0K(R.string.f11nameremoved, i4 + ((i3 * (100 - i4)) / 100));
        if (chatTransferViewModel.A02 != 2) {
            chatTransferViewModel.A02 = 2;
        }
    }

    public void BOS() {
    }

    public void BOT() {
    }

    public void BSa() {
    }

    public void BSc() {
    }

    public void onError(int i) {
        ChatTransferViewModel chatTransferViewModel;
        Object A002;
        AnonymousClass08M r0;
        int i2;
        C18260x0.A0y("fpm/ChatTransferViewModel/received errorCode: ", AnonymousClass001.A0o(), i);
        if (i != 2) {
            if (i != 102) {
                if (!(i == 107 || i == 504)) {
                    switch (i) {
                        case 600:
                            chatTransferViewModel = this.A00;
                            AnonymousClass0x9.A1I(chatTransferViewModel.A0E);
                            A002 = ChatTransferViewModel.A00();
                            break;
                        case 601:
                        case 602:
                        case 604:
                        case 605:
                            break;
                        case 603:
                            r0 = this.A00.A0F;
                            A002 = Boolean.TRUE;
                            break;
                        default:
                            chatTransferViewModel = this.A00;
                            A002 = chatTransferViewModel.A0E();
                            break;
                    }
                }
                chatTransferViewModel = this.A00;
                A002 = chatTransferViewModel.A0D();
            } else {
                chatTransferViewModel = this.A00;
                A002 = ChatTransferViewModel.A00();
            }
            int i3 = chatTransferViewModel.A01;
            int i4 = 1;
            if (!(i3 == 2 || i3 == 3)) {
                if (i3 == 4) {
                    int i5 = chatTransferViewModel.A02;
                    if (i5 != 0) {
                        i4 = 3;
                        if (i5 != 1) {
                            i4 = 4;
                        }
                    } else {
                        i4 = 2;
                    }
                } else {
                    i4 = 0;
                }
            }
            C55112po r7 = chatTransferViewModel.A0X;
            if (i != 200) {
                if (!(i == 202 || i == 302)) {
                    if (i != 501) {
                        switch (i) {
                            case 100:
                                break;
                            case 101:
                            case 102:
                                i2 = 17;
                                break;
                            case 103:
                                i2 = 11;
                                break;
                            case 104:
                            case 106:
                                i2 = 4;
                                break;
                            case 105:
                                i2 = 14;
                                break;
                            case 107:
                                i2 = 25;
                                break;
                            default:
                                switch (i) {
                                    case 503:
                                        i2 = 13;
                                        break;
                                    case 504:
                                    case 505:
                                        i2 = 9;
                                        break;
                                    default:
                                        switch (i) {
                                            case 600:
                                                i2 = 1;
                                                break;
                                            case 601:
                                                i2 = 26;
                                                break;
                                            case 602:
                                                i2 = 27;
                                                break;
                                            case 603:
                                            case 604:
                                                i2 = 5;
                                                break;
                                            case 605:
                                                i2 = 15;
                                                break;
                                            default:
                                                r7.A01.A0A("fpm/unexpected-migration-error-code", false, String.valueOf(i));
                                                i2 = 24;
                                                break;
                                        }
                                }
                        }
                    } else {
                        i2 = 10;
                    }
                }
                i2 = 23;
            } else {
                i2 = 22;
            }
            r7.A02(i4, (long) chatTransferViewModel.A00, i2);
            r0 = chatTransferViewModel.A0D;
            r0.A0G(A002);
            return;
        }
        ChatTransferViewModel chatTransferViewModel2 = this.A00;
        C55112po r4 = chatTransferViewModel2.A0X;
        r4.A08.BkM(new C70263aD(r4, 12, 5, (long) chatTransferViewModel2.A00));
        chatTransferViewModel2.A0D.A0G(chatTransferViewModel2.A0D());
    }
}
