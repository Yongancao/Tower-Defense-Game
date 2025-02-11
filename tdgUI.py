import pygame

pygame.init()
screen = pygame.display.set_mode((800, 600))
clock = pygame.time.Clock()

def draw_tower(x, y):
    pygame.draw.rect(screen, (0, 255, 0), (x, y, 40, 40))

running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    screen.fill((0, 0, 0))
    draw_tower(100, 100)
    pygame.display.flip()
    clock.tick(60)

pygame.quit()