#pragma once

#include "AdaptiveCards.Uwp.h"
#include "Enums.h"
#include "ToggleInput.h"

namespace AdaptiveCards { namespace Uwp
{
    class AdaptiveToggleInputRenderer :
        public Microsoft::WRL::RuntimeClass<
        Microsoft::WRL::RuntimeClassFlags<Microsoft::WRL::RuntimeClassType::WinRtClassicComMix>,
        ABI::AdaptiveCards::Uwp::IAdaptiveElementRenderer>
    {
        InspectableClass(RuntimeClass_AdaptiveCards_Uwp_AdaptiveToggleInputRenderer, BaseTrust)

    public:
        HRESULT RuntimeClassInitialize() noexcept;

        IFACEMETHODIMP Render(
            _In_ ABI::AdaptiveCards::Uwp::IAdaptiveCardElement* cardElement,
            _In_ ABI::AdaptiveCards::Uwp::IAdaptiveRenderContext* renderContext,
            _COM_Outptr_ ABI::Windows::UI::Xaml::IUIElement** result);
    };

    ActivatableClass(AdaptiveToggleInputRenderer);
}}