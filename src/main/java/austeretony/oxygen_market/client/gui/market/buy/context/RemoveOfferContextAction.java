package austeretony.oxygen_market.client.gui.market.buy.context;

import austeretony.alternateui.screen.core.GUIBaseElement;
import austeretony.oxygen_core.client.api.ClientReference;
import austeretony.oxygen_core.client.gui.elements.OxygenContextMenu.OxygenContextMenuAction;
import austeretony.oxygen_core.client.gui.elements.OxygenWrapperPanelEntry;
import austeretony.oxygen_market.client.OfferClient;
import net.minecraft.client.entity.EntityPlayerSP;

public class RemoveOfferContextAction implements OxygenContextMenuAction {

    @Override
    public String getLocalizedName(GUIBaseElement currElement) {
        return ClientReference.localize("oxygen_core.gui.remove");
    }

    @Override
    public boolean isValid(GUIBaseElement currElement) {
        return true;
    }

    @Override
    public void execute(GUIBaseElement currElement) {
        ((EntityPlayerSP) ClientReference.getClientPlayer()).sendChatMessage(
                String.format("/oxygens market -cancel-offer %s false", ((OxygenWrapperPanelEntry<OfferClient>) currElement).getWrapped().getId()));
    }
}
